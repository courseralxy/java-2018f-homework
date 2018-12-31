package calabashBrothers.formation;

import calabashBrothers.Coordinate;
import calabashBrothers.Maps;
import calabashBrothers.beings.Creature;

import java.util.ArrayList;

/**
 * @ Author     ：Young
 * @ Description：锋矢阵
 */
public class FengShi extends Formation{
    public FengShi(int startX, int startY) {
        super(startX, startY);
        initSites(startX,startY);
    }


    public void initSites(int x,int y){
        sites.add(new Coordinate(x,y));
        sites.add(new Coordinate(x,y+1));
        sites.add(new Coordinate(x-1,y+1));
        sites.add(new Coordinate(x+1,y+1));
        sites.add(new Coordinate(x+2,y+2));
        sites.add(new Coordinate(x,y+2));
        sites.add(new Coordinate(x-2,y+2));
        sites.add(new Coordinate(x+3,y+3));
        sites.add(new Coordinate(x,y+3));
        sites.add(new Coordinate(x-3,y+3));
        sites.add(new Coordinate(x,y+4));
        sites.add(new Coordinate(x,y+4)); //maybe some bugs
    }

    @Override
    public void SetFormation(Maps<Creature> maps, ArrayList<Creature> creatures, int direction) {
        for(int i=0;i<=11;i++){
            maps.setContent(sites.get(i).getX(),sites.get(i).getY(),creatures.get(i));
        }
    }

}
