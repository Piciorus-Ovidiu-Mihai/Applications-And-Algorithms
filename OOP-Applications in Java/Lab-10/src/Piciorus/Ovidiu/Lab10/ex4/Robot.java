package Piciorus.Ovidiu.Lab10.ex4;



public class Robot extends Thread {
    String name;
    int x, y;
    boolean isActive;
    static Robot[][] map = new Robot[100][100];


    public Robot(String name, boolean isActive, int x, int y){
        this.name=name;
        this.isActive=isActive;
        this.x=x;
        this.y=y;
        System.out.println(name + " x:" + x + " y:" + y + " is alive.");
    }

    public Robot(String name) {
        int a,b;
        boolean active=false;

        while(active==false) {
            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);

            if(map[a][b]==null) {
                map[a][b]= new Robot(name,true,a,b);
                map[a][b].start();
                active=true;
            }
        }
    }

    public void localization() {
        map[this.x][this.y] = this;
    }

    public void run() {
        System.out.println(name + " x:" + x + " y:" + y + " is moving.");
        try {
            while (this.isActive == true) {
                int dir = (int) (Math.random() * 100) % 4;
                switch (dir) {
                    case 0:
                        if (this.x < 99)
                            if (map[this.x + 1][this.y] == null) {
                                map[this.x][this.y]=null;
                                this.x = x + 1;
                                localization();
                            }
                            else
                            {
                                System.out.println("Destroy robots");
                                this.isActive=false;
                                map[this.x][this.y].isActive=false;
                                System.out.println("Robot " + name + " x:" + x + " y:" + y + " has been destroyed.");
                                map[this.x+1][this.y].isActive=false;
                                System.out.println("Robot " + map[this.x+1][this.y].name + " x:" + map[this.x+1][this.y].x + " y:" + map[this.x+1][this.y].y + " has been destroyed.");
                            }
                        System.out.println("Robot " + name + " x:" + x + " y:" + y);
                        break;
                    case 1:
                        if (this.y < 99)
                            if (map[this.x][this.y+1] == null) {
                                map[this.x][this.y]=null;
                                this.y = y + 1;
                                localization();
                            }
                            else
                            {
                                System.out.println("Destroy robots");
                                this.isActive=false;
                                map[this.x][this.y].isActive=false;
                                System.out.println("Robot " + name + " x:" + x + " y:" + y + " has been destroyed.");
                                map[this.x][this.y+1].isActive=false;
                                System.out.println("Robot " + map[this.x][this.y+1].name + " x:" + map[this.x][this.y+1].x + " y:" + map[this.x][this.y+1].y + " has been destroyed.");
                            }
                        System.out.println("Robot " + name + " x:" + x + " y:" + y);
                        break;
                    case 2:
                        if (this.x > 0)
                            if (map[this.x-1][this.y] == null) {
                                map[this.x][this.y]=null;
                                this.x = x - 1;
                                localization();
                            }
                            else
                            {
                                System.out.println("Destroy robots");
                                this.isActive=false;
                                map[this.x][this.y].isActive=false;
                                System.out.println("Robot " + name + " x:" + x + " y:" + y + " has been destroyed.");
                                map[this.x-1][this.y].isActive=false;
                                System.out.println("Robot " + map[this.x-1][this.y].name + " x:" + map[this.x-1][this.y].x + " y:" + map[this.x-1][this.y].y + " has been destroyed.");
                            }
                        System.out.println("Robot " + name + " x:" + x + " y:" + y);
                        break;
                    case 3:
                        if (this.y > 0)
                            if (map[this.x][this.y-1] == null) {
                                map[this.x][this.y]=null;
                                this.y = y - 1;
                                localization();
                            }
                            else
                            {
                                System.out.println("Destroy robots");
                                this.isActive=false;
                                map[this.x][this.y].isActive=false;
                                System.out.println("Robot " + name + " x:" + x + " y:" + y + " has been destroyed.");
                                map[this.x][this.y-1].isActive=false;
                                System.out.println("Robot " + map[this.x][this.y-1].name + " x:" + map[this.x][this.y-1].x + " y:" + map[this.x][this.y-1].y + " has been destroyed.");
                            }
                        System.out.println("Robot " + name + " x:" + x + " y:" + y);
                        break;

                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Robot[][] map = new Robot[10][10];

        Robot r1 = new Robot("Robot1");
        Robot r2 = new Robot("Robot2");
        Robot r3 = new Robot("Robot3");

    }
}