public class RobotI {


        private  int robotPositionX=0, robotPositionY=0;
        private String direction ;


    RobotI(int initialX , int initialY , String intialDirection){
        setRobotPositionX(initialX);;
        setRobotPositionY(initialY);
        setDirection(intialDirection);
    }


    public void setRobotPositionX(int robotPositionX) {
            this.robotPositionX = robotPositionX;
        }
        public void setRobotPositionY(int robotPositionY){
            this.robotPositionY = robotPositionY;
        }
        public  void setDirection(String direction){
            this.direction = direction ;
        }



        public int getRobotPositionX(){
            return robotPositionX;
        }

        public int getRobotPositionY(){
            return robotPositionY;
        }
        public String getDirection(){
            return direction ;
        }

        public  void move(){
            if(getDirection() == "north"){
                setRobotPositionX(this.robotPositionX + 1);
            }else if(getDirection() == "south"){
                setRobotPositionX(this.robotPositionX - 1);
            }else if(getDirection() == "west"){
                setRobotPositionY(this.robotPositionY + 1);
            }else if(getDirection() == "east"){
                setRobotPositionY(robotPositionY - 1);
            }
        }

        public void turnRight(){
            if(getDirection() == "north"){
                setDirection("east");
            }else if(getDirection() == "east"){
                setDirection("south");
            }else if(getDirection() == "south"){
                setDirection("west");
            }else if(getDirection() == "west"){
                setDirection("north");
            }
        }

        public void turnLeft(){
            if(getDirection() == "north"){
                setDirection("west");
            }else if(getDirection() == "west"){
                setDirection("south");
            }else if(getDirection() == "south") {
                setDirection("east");
            }else if(getDirection() == "east"){
                setDirection("north");
            }
        }

        public int[] getLocation(){
            int[] location = new int[2];
            location[0] = getRobotPositionX();
            location[1] = getRobotPositionY();

            return location ;
        }



    public static void main(String[] args) {
        RobotI robot = new RobotI(0, 0, "north");
        robot.move();
        System.out.println(robot.getLocation()[0] + " " + robot.getLocation()[1]);
        robot.turnLeft();
        System.out.println(robot.getDirection());
        robot.move();
        System.out.println(robot.getLocation()[0] + " " + robot.getLocation()[1]);
        robot.turnRight();
        System.out.println(robot.getDirection());
        robot.move();

        System.out.println(robot.getLocation()[0] + " " + robot.getLocation()[1]);


    }
}
