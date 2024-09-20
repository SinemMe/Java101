public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==== NEW ROUND ====");
                if (this.f1.isFirstHit()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    if (this.f2.isFirstHit()) {
                        this.f1.health = this.f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        System.out.println(this.f1.name + " Saglik: " + this.f1.health);
                        System.out.println(this.f2.name + " Saglik: " + this.f2.health);
                    }
                } else {
                    System.out.println("Sporcularin sikletleri uymuyor.");
                }
            }
        }
    }

            boolean isCheck () {
                return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

            }
            boolean isWin () {
                if (this.f1.health == 0) {
                    System.out.print(this.f2.name + " Kazandi! ");
                    return true;
                }
                if (this.f2.health == 0) {
                    System.out.println(this.f1.name + " Kazandi! ");
                    return true;
                }
                return false;
            }
        }
