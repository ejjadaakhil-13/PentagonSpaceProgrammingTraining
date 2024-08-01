public class ReverseAStringForParticularPosition {
    static String revwrd(String str){

        int i;
        String nwrd="", nsen="";
        for(i=0; i<str.length();i++){
            if(str.charAt(i)!=' '){
                nwrd=str.charAt(i)+nwrd;
            }else if(nwrd!=""){
                if(i==str.length()-1){
                    nsen=nsen+nwrd;
                }else{
                    nsen=nsen+nwrd+" ";
                }
                nwrd="";
            }
        }
        return nsen;
    }

    public static void main(String[] args) {
        String str="Robert Downey JR As DR.Doom";
        String res=revwrd(str);
        System.out.println(res);
    }

}
