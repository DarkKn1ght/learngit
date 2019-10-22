import org.testng.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test2 {

    @DataProvider(name="data1")
    public Object[][] data(){
        return new Object[][]{{"user1","pwd1"},{"user2","pwd2"}};
    }

    @Test(dataProvider="data1")
    public void dataprovidertest(String i,String j){
        System.out.println("i:"+i+"j:"+j);
    }
}
