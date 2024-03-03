
public class Innerclass02 {
    interface Bell {
        void ring();
    }


    class Cellphone {
        public void alarmclock(Bell bell) {
            bell.ring();
        }
    }

    public void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {

            }
        });
    }
}
