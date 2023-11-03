package ro.upt.ac.chiuitter.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\r\u001a\u00020\u000e*\u00020\bH\u0002J\f\u0010\u000f\u001a\u00020\b*\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lro/upt/ac/chiuitter/data/database/ChiuitDbStore;", "Lro/upt/ac/chiuitter/domain/ChiuitRepository;", "appDatabase", "Lro/upt/ac/chiuitter/data/database/AppDatabase;", "(Lro/upt/ac/chiuitter/data/database/AppDatabase;)V", "addChiuit", "", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "removeChiuit", "toDbModel", "Lro/upt/ac/chiuitter/data/database/ChiuitEntity;", "toDomainModel", "app_debug"})
public final class ChiuitDbStore implements ro.upt.ac.chiuitter.domain.ChiuitRepository {
    @org.jetbrains.annotations.NotNull
    private final ro.upt.ac.chiuitter.data.database.AppDatabase appDatabase = null;
    
    public ChiuitDbStore(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.data.database.AppDatabase appDatabase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<ro.upt.ac.chiuitter.domain.Chiuit>> getAll() {
        return null;
    }
    
    @java.lang.Override
    public void addChiuit(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
    
    @java.lang.Override
    public void removeChiuit(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
    
    private final ro.upt.ac.chiuitter.data.database.ChiuitEntity toDbModel(ro.upt.ac.chiuitter.domain.Chiuit $this$toDbModel) {
        return null;
    }
    
    private final ro.upt.ac.chiuitter.domain.Chiuit toDomainModel(ro.upt.ac.chiuitter.data.database.ChiuitEntity $this$toDomainModel) {
        return null;
    }
}