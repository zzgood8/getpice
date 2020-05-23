import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        String s = "d:\\img\\two\\";
        String u = "d:\\img\\one\\";
       for (int i = 1; i < 71; i++){
            File file = new File(s+String.format("%02d",i)+".jpg");
            FileInputStream in = new FileInputStream(file);
            BufferedInputStream in2 = new BufferedInputStream(in);
            Image bi = ImageIO.read(in2);
            BufferedImage tag = new BufferedImage(500,350,BufferedImage.TYPE_3BYTE_BGR);
            tag.getGraphics().drawImage(bi,0,0,500,350,null);
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(u+String.format("%02d",i)+".jpg"));
            ImageIO.write(tag,"jpg",out);

            in.close();
            in2.close();
            out.close();
           System.out.println("图片"+i+"已保存");
       }
    }
}
