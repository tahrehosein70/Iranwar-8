// NetworkManager.java
import android.net.wifi.p2p.WifiP2pManager;

public class NetworkManager {
    private WifiP2pManager manager;
    private WifiP2pManager.Channel channel;
    
    public void setupNetwork(Context context) {
        manager = (WifiP2pManager) context.getSystemService(Context.WIFI_P2P_SERVICE);
        channel = manager.initialize(context, context.getMainLooper(), null);
    }
    
    public void createGroup() {
        manager.createGroup(channel, new WifiP2pManager.ActionListener() {
            @Override
            public void onSuccess() {
                // گروه ایجاد شد
            }
            
            @Override
            public void onFailure(int reason) {
                // خطا در ایجاد گروه
            }
        });
    }
}
