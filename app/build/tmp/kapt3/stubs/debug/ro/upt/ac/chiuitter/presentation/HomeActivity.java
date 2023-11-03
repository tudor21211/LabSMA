package ro.upt.ac.chiuitter.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0003J\b\u0010\f\u001a\u00020\u0006H\u0003J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0003J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lro/upt/ac/chiuitter/presentation/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lro/upt/ac/chiuitter/presentation/HomeViewModel;", "AddFloatingButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "ChiuitListItem", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "DefaultPreview", "HomeScreen", "composeChiuit", "extractText", "data", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "shareChiuit", "text", "", "Companion", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
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
    private final void HomeScreen(ro.upt.ac.chiuitter.presentation.HomeViewModel viewModel) {
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
    private final void DefaultPreview() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lro/upt/ac/chiuitter/presentation/HomeActivity$Companion;", "", "()V", "COMPOSE_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}