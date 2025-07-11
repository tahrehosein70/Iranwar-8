// IranMapView.java
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class IranMapView extends View {
    private Paint paint = new Paint();
    private int playerCount;
    
    public IranMapView(Context context, int players) {
        super(context);
        this.playerCount = players;
        paint.setStyle(Paint.Style.STROKE);
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        // تقسیم نقشه به مناطق مساوی
        int width = getWidth() / playerCount;
        for (int i = 0; i < playerCount; i++) {
            paint.setColor(getPlayerColor(i));
            canvas.drawRect(i * width, 0, (i + 1) * width, getHeight(), paint);
        }
    }
    
    private int getPlayerColor(int index) {
        // رنگ‌های مختلف برای بازیکنان
        int[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        return colors[index % colors.length];
    }
}
