public class PositionChanges extends Team{
    public void promote(String tag,String pozicio){
        for (int i = 0; i < tagok.size(); i++){
            if (tagok.get(i)[0] == tag){
                tagok.get(i)[1] = pozicio;
            }
        }
    }
}