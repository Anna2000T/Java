import java.util.List;

public class felsoruhazat extends Gardróbszekrény {

    String _type;
    String _color;
    int _daysWorn;
    int _allapot;
    



    
    public felsoruhazat(String _type, String _color, int _daysWorn, int _allapot) {
        this._type = _type;
        this._color = _color;
        this._daysWorn = _daysWorn;
        this._allapot = _allapot;
    }

    public felsoruhazat() {
       
    }





    public String get_type() {
        return _type;
    }





    public void set_type(String _type) {
        this._type = _type;
    }





    public String get_color() {
        return _color;
    }





    public void set_color(String _color) {
        this._color = _color;
    }





    public int get_daysWorn() {
        return _daysWorn;
    }





    public void set_daysWorn(int _daysWorn) {
        this._daysWorn = _daysWorn;
    }





    public int get_allapot() {
        return _allapot;
    }





    public void set_allapot(int _allapot) {
        this._allapot = _allapot;
    }





 
    
}
