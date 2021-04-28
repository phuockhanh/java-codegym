public class Car implements Runnable {
    private String name;
    public Car(String name){
        this.name = name;
    }
    @Override
    public void run(){
        int start =0;
        //time?
        long startTime = System.currentTimeMillis();
        while (start<Main.end){
            try {
                int speed =(int) (Math.random()*40+1);
                start+=speed;
                String log ="|";
                for(int i=0;i<Main.end;i+=Main.step){
                    if(i+Main.step <= start){
                        log += "=";
                    }
                    else if(i<= start){
                        log += "O";
                    }
                    else{
                        log += "-";
                    }
                }
                log+="|";
                System.out.println("Car "+this.name + ": "+log+" "+ Math.min(start, Main.end)+"Km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car "+this.name +" Boken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car "+this.name + " Finish in " + (endTime-startTime)/1000+"s");
    }
}
