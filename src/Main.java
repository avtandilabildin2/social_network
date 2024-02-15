import entity.User;

import java.util.Scanner;

public class Main {
    static User[] users=new User[0];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//vyzyvaem scanner

        String command;//sozdaem stroku command

        while(true){//vyzyvaem tsikl while kotoraia budet rabotat do teh por poka break ne poiavlaietsa
            System.out.println("Zaregistrirovannyh polzovatelei v sisteme: "+users.length);//schitaem skolko ludei zaregistrirovano
            System.out.print("Print command: ");//vyvodit vvdei comandu
            command=sc.nextLine();//vvod commandy
            if(command.equals("register")){//esli vvod ravno register to on zahodit v blok koda
                User user=register(sc);//vyzyvaem metod register
                System.out.println("Byl sozdan polzovatel: "+user);//posle obrabotki metoda vyvodim chto  my sozdali polzovatelya
            }
            else if(command.equals("login")){//esli commanda ravno loginu to
                System.out.println("Incoming command login ");//to vyvodim chto my v logine
            }
            else if(command.equals("logout")){//esli commanda ravno logoutu to
                System.out.println("Incoming command logout ");//to vyvodim o logoute
            }
            else if(command.equals("info")){//esli commanda ravno info
                System.out.println("Incoming command info ");//to vyvodim ob info
            }
            else if(command.equals("exit")){//esli commanda ravno exit to
                System.out.println("Incoming command exit ");//vyvodim pro exit
                break;//i zavershaem programmu
            }
            else{//v inom sluchae
                System.out.println("This command doesn't exists");//vyvodim chto takoi comandy ne sushshestvuet
            }
        }
    }
    static void getUserID(int userID){
        //nichego ne znaiu
    }
    public static User register(Scanner sc){
        User user =new User();//sozdaiem object user
        System.out.println("Incoming command register: ");//vyvodim chto  my vvodili register
        System.out.print("Create your login: ");//vyvodim chto polzovatel doljen sozdat login
        String login=sc.nextLine();//vvodim login
        if(login.length()<5){//esli dlina logina menshe pyati simvolov
            System.out.println("Nevernyi format logina: login ne dolzhen byt koroche pyati simvolov");//to vyvodim simvolov dolzhno byt ne menshe pyati simvolov
            System.out.println("Registratsiya prervana");//vyvodim o prervanii registratsii
            return null;//nichego ne vozvrashshaem
        }
        if(login.contains(" ")){//esli login v sebe soderjit probely to
            System.out.println("Nevernyi format logina login ne dolzhen soderzhat probely");//vyvodim chto login ne dolzhen soderzhat probely
            System.out.println("registratsiya prervana");//vyvodim o prervanii registratsii
            return null;//nichego ne vozvrashshaem
        }
        boolean correctSim=false;//sozdaiem logicheskiy tip dannyh correctSim
        for (int i = 31; i <127 ; i++) {//tsikl idet  ot 31 do 126
            if((i>32 && i<47) ||(i>57 && i<64)||(i>90 && i<97)|| (i>122)){//esli index ascii ravno simvolu
                String sim=""+(char)i;//dobavlaiem simvol v pustuiu stroku
                if(login.contains(sim)){//esli login v sebe soderzhit simvol
                    correctSim=true;//to correctSim ravnaietsya true
                }
            }
        }
        if(correctSim){//esli correctSim==true
            System.out.println("Nevernyi format logina");//vyvodim novyi format logina
            System.out.println("Login ne dolzhen soderzhat simvoly");//i soobshaem chto login ne dolzhen sodershat v sebe simvoly
            return null;//nichego ne vozvrashshaem
        }
        user.setLogin(login);//vvodim login
        System.out.print("Create your password: ");//sozdaiem password
        user.setPassword(sc.nextLine());//sozdaiem password
        User[] usersTmp=new User[users.length+1];//sozdaiem novyi massiv na razmer bolshe chem prezhniy
        for (int i = 0; i <users.length ; i++) {//vyzyvaem tsikl so schetchikom
            usersTmp[i]=users[i];//vse elementy proshlogo massiva perenosim v novyi massiv
        }
        usersTmp[users.length]=user;//priravnivaem posledniy element ueru
        users=usersTmp;//stariy massiv priravnivaem novomu massivu
        System.out.println("Register finished");//vyvodim o zavershenii registratsii
        return user;//vozvrahsshaem user
    }
}
/*
dz=1)sdelat tak chtoby v uslovii comandy register bylo maksimum odna strochka
2)zakomentirovat kajduiu strocku koda(Chto delaiet dannaia strochka,dlia chego nuzhna ,v chem ee smysl
3)dlia chego nuzhen metod rasskaazat na sleduiushem uroke
4)dopisat programmu
5)rasskazat o problemah nashego koda
 */