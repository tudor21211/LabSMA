package ro.upt.ac.chiuitter.data.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ChiuitDao_Impl implements ChiuitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChiuitEntity> __insertionAdapterOfChiuitEntity;

  private final EntityDeletionOrUpdateAdapter<ChiuitEntity> __deletionAdapterOfChiuitEntity;

  public ChiuitDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChiuitEntity = new EntityInsertionAdapter<ChiuitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `chiuits` (`timestamp`,`description`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final ChiuitEntity entity) {
        statement.bindLong(1, entity.getTimestamp());
        if (entity.getDescription() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDescription());
        }
      }
    };
    this.__deletionAdapterOfChiuitEntity = new EntityDeletionOrUpdateAdapter<ChiuitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `chiuits` WHERE `timestamp` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final ChiuitEntity entity) {
        statement.bindLong(1, entity.getTimestamp());
      }
    };
  }

  @Override
  public void addChiuit(final ChiuitEntity chiuit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfChiuitEntity.insert(chiuit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeChiuit(final ChiuitEntity chiuit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfChiuitEntity.handle(chiuit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<ChiuitEntity>> getAll() {
    final String _sql = "SELECT * FROM chiuits";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"chiuits"}, new Callable<List<ChiuitEntity>>() {
      @Override
      @NonNull
      public List<ChiuitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<ChiuitEntity> _result = new ArrayList<ChiuitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ChiuitEntity _item;
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item = new ChiuitEntity(_tmpTimestamp,_tmpDescription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
