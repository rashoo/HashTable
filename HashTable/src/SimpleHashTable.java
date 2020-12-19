public class SimpleHashTable {

    private Employee[] hashtable;
    public SimpleHashTable(){
        hashtable = new Employee[10];
    }

    public void putInHashtable(String key, Employee employee){
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null){
            System.out.println("Position not null at " + hashedKey);
        }else{
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i=0; i < hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
    }
}
