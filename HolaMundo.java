public class HolaMundo{
    public static void DesicionExamen(String profesor, String estudiaron){
        boolean estudiantes = null;
        if("No".equals(estudiaron)){
            estudiantes = false;
        }else{
            estudiantes = true;
        }
        if("Piedad".equals(profesor) && estudiantes==false){
               System.out.println("Todos estan exonerados con 90");
        }else{
            System.out.println("Nos Vemos el Proximo Semestre");
        }
    }
    public static void main(String[] args) {
        
        String estudiaron = "No";
        String profesor = "Piedad";
       /* 
        System.out.println("Android Java...");
        System.out.println("IvanDroid");
        System.out.println("Capa 8 Reload!");
        System.out.println("Ahora va Henry");
        System.out.println("ElCaboMota");
        System.out.println("El Poderoso Jeury");
        System.out.println("El carlangas ");
        
        
        //imprimir los numeros del 1 al 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        */
        DesicionExamen(profesor,estudiaron);
    } 
}
