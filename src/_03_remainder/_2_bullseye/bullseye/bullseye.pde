
void setup() {
 
  // set the size of your sketch
  size(800,800);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and remainder to alternate the color of your rings.
  for(int i=0; i<=8; i++) {
  if(i%2==0) {
  fill(255,0,0); 
  }else{
    fill(0,0,0);
  }
  ellipse(400,400,800-(i*100),800-(i*100));
  }
}
