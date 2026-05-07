/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author HP VICTUS
 */
public class Vector2d {
    private Double x;
    private Double y;

    public Vector2d(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Vector2d add(Vector2d v) {
        return new Vector2d(this.x + v.getX(), this.y + v.getY());
    }
    
    public Vector2d scalarMultiplication(Double k) {
        return new Vector2d(this.x * k, this.y * k);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector2d vector2d = (Vector2d) obj;
        return x.equals(vector2d.x) && y.equals(vector2d.y);
    }
}
