import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BannerAnimationDemo extends Frame implements Runnable{
    private volatile String str = " DREAM TECH PUBLICATIONS ";
    private volatile boolean running = true;

    BannerAnimationDemo() {
        setLayout(null);
        setBackground(Color.cyan);
        setForeground(Color.red);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                running = false;
                dispose();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font f = new Font("Courier", Font.BOLD, 40);
        g.setFont(f);
        g.drawString(str, 10, 100);
    }

    @Override
    public void run() {
        while (running) {
            repaint();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            char ch = str.charAt(0);
            str = str.substring(1);
            str += ch;
        }
    }

    private static void runInConsole() {
        String banner = " DREAM TECH PUBLICATIONS ";
        while (!Thread.currentThread().isInterrupted()) {
            System.out.print("\r" + banner);
            System.out.flush();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            banner = banner.substring(1) + banner.charAt(0);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (GraphicsEnvironment.isHeadless()) {
            runInConsole();
            return;
        }

        BannerAnimationDemo b = new BannerAnimationDemo();
        b.setSize(400, 400);
        b.setTitle("My banner");
        b.setVisible(true);
        new Thread(b, "banner-animation").start();
    }
}
