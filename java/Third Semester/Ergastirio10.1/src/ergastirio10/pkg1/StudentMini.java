/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio10.pkg1;

/**
 *
 * @author Lalik
 */
public class StudentMini {
     private int am;
    private String onoma, epitheto;

   public StudentMini()
   {
       this(0,"","");
   }
    
    
    public StudentMini(int am, String onoma, String epitheto)
    {
        this.am = am;
        this.onoma = onoma;
        this.epitheto = epitheto;
    }

    public void setAM(int am)
    {
        this.am = am;
    }

    public void setOnoma(String onoma)
    {
        this.onoma = onoma;
    }

    public void setEpitheto(String epitheto)
    {
        this.epitheto = epitheto;
    }

    public int getAM()
    {
        return am;
    }

    public String getOnoma()
    {
        return onoma;
    }

    public String getEpitheto()
    {
        return epitheto;
    }

    @Override
    public String toString() {
        return "StudentMini{" + "am=" + am + ", onoma=" + onoma + ", epitheto=" + epitheto + '}';
    }
    
}
