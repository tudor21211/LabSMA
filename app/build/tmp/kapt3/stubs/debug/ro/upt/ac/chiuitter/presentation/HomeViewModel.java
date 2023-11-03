package ro.upt.ac.chiuitter.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bR\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lro/upt/ac/chiuitter/presentation/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "chiuitRepository", "Lro/upt/ac/chiuitter/domain/ChiuitRepository;", "(Lro/upt/ac/chiuitter/domain/ChiuitRepository;)V", "chiuitListState", "Lkotlinx/coroutines/flow/Flow;", "", "Lro/upt/ac/chiuitter/domain/Chiuit;", "getChiuitListState", "()Lkotlinx/coroutines/flow/Flow;", "chiuitListState$delegate", "Lkotlin/Lazy;", "addChiuit", "", "description", "", "removeChiuit", "chiuit", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final ro.upt.ac.chiuitter.domain.ChiuitRepository chiuitRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chiuitListState$delegate = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.domain.ChiuitRepository chiuitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<ro.upt.ac.chiuitter.domain.Chiuit>> getChiuitListState() {
        return null;
    }
    
    public final void addChiuit(@org.jetbrains.annotations.NotNull
    java.lang.String description) {
    }
    
    public final void removeChiuit(@org.jetbrains.annotations.NotNull
    ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
}