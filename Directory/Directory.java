public class Directory{

    public static void main(String [] args){
        Data ultimateDell = new Data("Dell", "Curry", 50);
        System.out.println(ultimateDell.getFirstName() + " " + ultimateDell.getLastName() + " " + ultimateDell.getAge());
        
        
        Data dell = new Data();
        dell.setFirstName("Dell");
        System.out.println(dell.getFirstName());
        dell.setLastName("Curry");
        System.out.println(dell.getLastName());
        
        Data stephen = new Data();
        stephen.setFirstName("Stephen");
        System.out.println(stephen.getFirstName());
        stephen.setLastName("Curry");
        System.out.println(stephen.getLastName());
    
        Data riley = new Data ();
        riley.setFirstName("Riley");
        System.out.println(riley.getFirstName());
        riley.setLastName("Curry");
        System.out.println(riley.getLastName());

        Data ayesha = new Data ();
        ayesha.setFirstName("Ayesha");
        System.out.println(ayesha.getFirstName());
        ayesha.setLastName("Curry");
        System.out.println(ayesha.getLastName());

        Data [] stephen_relations = new Data[3];
        stephen_relations[0] = dell;
        stephen_relations[1] = ayesha;
        stephen_relations[2] = riley;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
       






}
