package ro.upt.ac.chiuitter.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lro/upt/ac/chiuitter/data/database/ChiuitDao;", "", "addChiuit", "", "chiuit", "Lro/upt/ac/chiuitter/data/database/ChiuitEntity;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "removeChiuit", "app_debug"})
@androidx.room.Dao
public abstract interface ChiuitDao {
    
    @androidx.room.Query(value = "SELECT * FROM chiuits")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ro.upt.ac.chiuitter.data.database.ChiuitEntity>> getAll();
    
    @androidx.room.Insert
    public abstract void addChiuit(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.data.database.ChiuitEntity chiuit);
    
    @androidx.room.Delete
    public abstract void removeChiuit(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.data.database.ChiuitEntity chiuit);
}