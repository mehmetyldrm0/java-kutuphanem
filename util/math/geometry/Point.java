/*------------------------------------------------------------------
	FILE		: Point.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 16.10.2022
	
	Immutable Point class that represents a 2(two) dimensional point in
	Cartesian plane
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Point {
	private final double m_x;
	private final double m_y;

	private Point(double a, double b, boolean polar)
	{
		if (polar) {
			m_x = a * cos(b);
			m_y = a * sin(a);
		}
		else  {
			m_x = a;
			m_y = b;
		}
	}

	public static Point createCartesian()
	{
		return createCartesian(0);
	}

	public static Point createCartesian(double x)
	{
		return createCartesian(x, 0);
	}

	public static Point createCartesian(double x, double y)
	{
		return new Point(x, y, false);
	}

	public static Point createPolar(double radius, double theta)
	{
		return new Point(radius, theta, true);
	}

	public double getX()
	{
		return m_x;
	}

	public double getY()
	{
		return m_y;
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(double x, double y)
	{
		return PointCommon.distance(m_x, m_y, x, y);
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}	
	
	public Point offset(double dxy)
	{
		return offset(dxy, dxy);
	}
	
	public Point offset(double dx, double dy)
	{
		return createCartesian(m_x + dx, m_y + dy);
	}

	public MutablePoint toMutablePoint()
	{
		return MutablePoint.createCartesian(m_x, m_y);
	}

	public String toString()
	{
		return String.format("(%f, %f)", m_x, m_y);
	}
}
