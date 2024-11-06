import java.util.List;
import java.security.AllPermission;
import java.util.ArrayList;

public class Gardróbszekrény {

    String _type;
    String _color;
    int _daysWorn;
    int _allapot;
    List<Gardróbszekrény> _szekreny;
    




    public void addCloth(felsoruhazat ruha)
    {
        this._szekreny.add(ruha);

    }

    public void addCloth(alsoruhazat alsoruhazat) {
        this._szekreny.add(alsoruhazat);
    }
   


    public void printInfo()
    {
        System.out.println(this._szekreny);

    }

    public void washAllClothes()
    {
      
        
    }


    public void repairAllClothes()
    {


    }

    public void purge()
    {
     
        
            for (Gardróbszekrény gardróbszekrény : _szekreny) {
                if(gardróbszekrény._allapot == 0)
                {
                    _szekreny.remove(_szekreny);
                }
                
            }

    }

  
    public boolean needsToBeWashed()
    {
        boolean mosnikell = false;
        if(this._daysWorn > 5)
        {
            mosnikell  =true;

        }

        return mosnikell;

    }

     public boolean needsToBeRepaired()
     {
        boolean javitanikell = false;
        if(this._allapot > 5)
        {
            javitanikell  =true;


        }
        return javitanikell;

     }

     public int wear() 
     {
        int worn = 0;
        for (Gardróbszekrény gardróbszekrény : _szekreny) {

            if(needsToBeWashed() == false)
            {
                worn += 1;
            }
            
        }
        return worn;
        

     }

     public void wash() 
     {
        if(this._daysWorn < 0)
        {
            System.out.println("Hiba");
        }
        else
        {
            this._allapot -= 1;
             this._daysWorn = 0;
        }
       
     }

     public void repair()
     {
        this._allapot = 0;
     } 

     public String getInfo() 
     {
        return  this._color +   this._daysWorn  +  "napja viselt" +  this._allapot +  "mosási ciklusa maradt hátra.";

     }





    
}
