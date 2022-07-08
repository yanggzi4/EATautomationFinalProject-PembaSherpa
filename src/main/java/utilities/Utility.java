package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

public class Utility {
    public static String currentDir= System.getProperty("user.dir");
    public static Properties loadProperties(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream(currentDir+"/config.properties");
            prop.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    public static String decode(String key){
        byte[] decodedBytes = Base64.getDecoder().decode(key);
        return new String(decodedBytes);
    }
   // public static void main(String[] args) {
        String originalStr = "hotmailS4";
       String encyptedStr;
      //encyptedStr = Base64.getEncoder().encodeToString(originalStr.getBytes());
      //System.out.println(encyptedStr);

        //System.out.println(Utility.decode("aG90bWFpbFM0"));
    //}
}
