package com.busurca;

class TankTruck {

    double tankVol(int h, int d, int vt) {

        double radius = d/2;
        System.out.println("radius is " + radius);
        double radiusSquared = Math.pow(radius,2);
        System.out.println("radius squared is " + radiusSquared);
        double remainingHeight = radius - h;
        System.out.println("remaining height is " + remainingHeight);

        //cylinder volume is PI*r*r*l(cylinder length)
        double cylinderLength = vt/(Math.PI*Math.pow(radius,2));
        System.out.println("cylinder length is " + cylinderLength);

        //segment volume is 1/2*r*r*(tetha - sin(tetha))*l
        //tetha = 2*arccos(m/r) where m is r-h
        double tetha = 2 * Math.acos(remainingHeight/radius);
        System.out.println("tetha is " + tetha);
        double sinTetha = Math.sin(tetha);
        System.out.println("sinTetha is " + sinTetha
        );
        double segmentVolume = 1/2*radiusSquared*(tetha - sinTetha)*cylinderLength;
        System.out.println(segmentVolume);

        return segmentVolume;
    }

}
