public class Car {

	private String color;
	private int speed;
	private int maxSpeed;

	public Car(String color, int maxSpeed){
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}

	public int getSpeed(){
		return(this.speed);
	};
	
	public void accelerate(int amount){
		int limit = this.maxSpeed - this.speed;
		if(amount >= limit){
		  this.speed = limit;
		}else{
		  this.speed+= amount;
		}
	}
	
	public void decelerate(int amount){
		int decelerationLimit = this.speed -= amount;
		if(decelerationLimit <= 0) {
			this.speed = 0;
		}else{
			this.speed = decelerationLimit;
		}
	}

	public String toString(){
		return("Color: " + this.color + ", Speed: " + this.speed);
	}

}
