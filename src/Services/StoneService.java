package Services;

import enums.PreciousStoneEnum;
import enums.SemiPreciousStoneEnum;
import models.PreciousStone;
import models.SemiPreciousStone;
import models.Stone;

import java.util.Random;

public class StoneService {
    public static Stone createStone(){
        Random random = new Random();
        PreciousStoneEnum[] preciousStoneEnums = PreciousStoneEnum.values();
        SemiPreciousStoneEnum[] semiPreciousStoneEnums = SemiPreciousStoneEnum.values();

        if(random.nextInt(2) == 1){
            return new PreciousStone(random.nextDouble() * 1000 + 0.1,
                    random.nextDouble() * 100,
                    random.nextInt(50,100),
                    preciousStoneEnums[random.nextInt(preciousStoneEnums.length)]);
        }else {
            return new SemiPreciousStone(random.nextDouble() * 100 + 0.1,
                    random.nextDouble() * 100,
                    random.nextInt(0,49),
                    semiPreciousStoneEnums[random.nextInt(semiPreciousStoneEnums.length)]);
        }
    }
}
