package ro.upt.ac.chiuitter.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0003J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lro/upt/ac/chiuitter/presentation/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "chiuitText", "Landroidx/compose/runtime/MutableState;", "", "viewModel", "Lro/upt/ac/chiuitter/presentation/HomeViewModel;", "AddFloatingButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "ChiuitListItem", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "DefaultPreview", "HomeScreen", "composeChiuit", "extractText", "data", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "shareChiuit", "text", "Companion", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> chiuitText = null;
    private ro.upt.ac.chiuitter.presentation.HomeViewModel viewModel;
    public static final int COMPOSE_REQUEST_CODE = 1213;
    @org.jetbrains.annotations.NotNull
    public static final ro.upt.ac.chiuitter.presentation.HomeActivity.Companion Companion = null;
    
    public HomeActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.compose.runtime.Composable
    private final void HomeScreen() {
    }
    
    @androidx.compose.runtime.Composable
    private final void ChiuitListItem(ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
    
    @androidx.compose.runtime.Composable
    private final void AddFloatingButton(androidx.compose.ui.Modifier modifier) {
    }
    
    private final void shareChiuit(java.lang.String text) {
    }
    
    private final void composeChiuit() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void extractText(android.content.Intent data) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable
    public final void DefaultPreview() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lro/upt/ac/chiuitter/presentation/HomeActivity$Companion;", "", "()V", "COMPOSE_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}