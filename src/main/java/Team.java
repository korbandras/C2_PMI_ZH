import java.util.ArrayList;

public class Team{
    protected ArrayList<String[]> tagok = new ArrayList<>();
    public void newMember(String nev, String pozicio){
        String[] elem = new String[2];
        elem[0] = nev;
        elem[1] = pozicio;
        tagok.add(elem);
    }

    public void leaveTeam(String nev){
        for (int i = 0; i < tagok.size(); i++){
            if (tagok.get(i)[0] == nev){
                tagok.remove(i);
            }
        }
    }

    public String getMembers(){
        String eredmeny ="";
        for (int i = 0; i < tagok.size(); i++){
            if(i==tagok.size()-1){
                eredmeny+=tagok.get(i)[0]+" "+tagok.get(i)[1];
            }
            else{
                eredmeny+=tagok.get(i)[0]+" "+tagok.get(i)[1]+"\r\n";
            }

        }
        return eredmeny;
    }
}