package cosamv.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    private Paint paint;
    private Path path;


    // コンストラクタ(初期設定)
    public MyView(Context con) {
        super(con);

        paint = new Paint();
        path = new Path();
    }
    //描写の処理
    @Override
    protected void  onDraw(Canvas canvas) {
        //背景
        canvas.drawColor(Color.DKGRAY);

        //円
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(20);
        canvas.drawCircle(400,500,150,paint);
        paint.setColor(Color.RED);
        canvas.drawCircle(400,500,50,paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(400,500,157,paint);

        //矩形
        paint.setColor(Color.CYAN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100,500,405,900,paint);

        //線
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(16);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(5);
        canvas.drawLine(0,0,canvas.getHeight(),canvas.getWidth(),paint);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(32);
        canvas.drawLine(0,canvas.getHeight(),canvas.getWidth(),0,paint);

        //三角形（パス）
        paint.setColor(Color.LTGRAY);
        path.moveTo(1200,30);
        path.lineTo(600,70);
        path.lineTo(400,300);
        path.lineTo(500,150);
        canvas.drawPath(path,paint);

        path.reset();
        paint.setColor(Color.GRAY);
        path.moveTo(320,320);
        path.lineTo(420,720);
        path.lineTo(320,620);
        path.lineTo(420,420);
        canvas.drawPath(path,paint);

        //国旗
        paint.setColor(Color.rgb(0,0,255));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100,500,100,100,paint);

        //矩形
        paint.setColor(Color.rgb(245,255,100));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(300,500,800,710,paint);






    }

}