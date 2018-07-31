package Maven2;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends Utils {

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream("src\\test\\Resources\\TestData\\TestDataConfig.properties");
            prop.load(input);

        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

