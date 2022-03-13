public class Lock {
    private int _secret1,_secret2,_secret3,_current,_status;

    public Lock(int secret1,int  secret2,int secret3){
        this._secret1=secret1;
        this._secret2=secret2;
        this._secret3=secret3;
        this._current=0;
        this._status=0;

    }

    public void reset(){
        this._status=0;
        this._current=0;
        System.out.println("Lock is reset");
    }

    public void turnLeft(int ticks){
        _current=_current-ticks;
        if(_current<0) _current=39-_current;
        System.out.println("Left ticks = ["+ticks+"[ and current "+_current);
        if(_status==1 && _current==_secret2){
            _status=2;
        }
        else _status=0;
    }

    public void turnRight(int ticks){
        _current=_current+ticks;
        if(_current>39) _current=_current-39;
        System.out.println("Right ticks = ["+ticks+"[ and current "+_current);
        if(_status==0 && _current==_secret1){
            _status=1;
        }
        else if(_status==2 && _current==_secret3){
            _status=3;
        }
        else _status=0;


    }

    public boolean open(){
        if(_status==3){
            return true;
        }
        else {
            return false;
        }

    }


    public static void main(String[] args) {
        Lock l=new Lock(36,24,36);
        l.reset();
        l.turnRight(36);
        l.turnLeft(12);
        l.turnRight(12);

        boolean ok=l.open();
        if(ok){
            System.out.println("Lock is open ");
        }
        else{
            System.out.println("Lock doesn`t open ");
        }

    }
}
