interface Database{
    void connect();
    void disconnect();
}
class DatabaseOne implements Database{
    public void connect(){
        System.out.println("Database one connected");
    }
    public void disconnect(){
        System.out.println("Database one disconnected");
    }
}
class DatabaseTwo implements Database{
    public void connect(){
        System.out.println("Database two connected");
    }
    public void disconnect(){
        System.out.println("Database two disconnected");
    }
}
class DatabaseThree implements Database{
    public void connect(){
        System.out.println("Database three connected");
    }
    public void disconnect(){
        System.out.println("Database three disconnected");
    }
}
public class MainDatabase{
    public static void main(String[] args) {
        Database obj;
        obj = new DatabaseOne();
        obj.connect();
        obj.disconnect();
        obj = new DatabaseTwo();
        obj.connect();
        obj.disconnect();
        obj = new DatabaseThree();
        obj.connect();
        obj.disconnect();
    }
}