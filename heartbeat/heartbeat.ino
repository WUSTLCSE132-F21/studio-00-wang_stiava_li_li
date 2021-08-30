/* heartbeat
 *
 * output simple hello message
 *
 */
int x = 0;
void setup() {
}

void loop() {
  Serial.print(x);
  Serial.println("sec have elapsed");
  Serial.delay(1000);
}
