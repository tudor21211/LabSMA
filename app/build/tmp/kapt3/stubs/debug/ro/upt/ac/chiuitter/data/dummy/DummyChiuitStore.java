package ro.upt.ac.chiuitter.data.dummy;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lro/upt/ac/chiuitter/data/dummy/DummyChiuitStore;", "Lro/upt/ac/chiuitter/domain/ChiuitRepository;", "()V", "addChiuit", "", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "removeChiuit", "app_debug"})
public final class DummyChiuitStore implements ro.upt.ac.chiuitter.domain.ChiuitRepository {
    
    public DummyChiuitStore() {
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
}