package java.lejosutil;

import java.lejoslang.Float;
import java.lejoslang.Double;
import java.lejoslang.Comparable;

/**
 * Various tools for arrays.
 * NOTE: currently bubblesort is used for sorting arrays.
 *
 * @author Juan Antonio Brenha Moral, Sven Köhler
 */
public class Arrays {
	//TODO use faster algorithm like quicksort
	//TODO checks whether from/toIndex are valid etc.

	//MISSING public static <T> List<T> asList(T... a)
	//MISSING public static <T> T[] copyOf(T[] original, int newLength)
	//MISSING public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType)
	//MISSING public static <T> T[] copyOfRange(T[] original, int from, int to)
	//MISSING public static <T,U> T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType)
	//MISSING public static int hashCode*
	//MISSING public static int deepHashCode(Object[] a)
	//MISSING public static String deepToString(Object[] a)
	//MISSING public static boolean deepEquals(Object[] a1, Object[] a2)


	private Arrays() {
		// class cannot be instantiated
	}

	/****************** BINARY SEARCH ******************/

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(byte[] a, byte val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			byte amid = a[mid];
			if (key < amid)
				toIndex = mid;
			else if (key > amid)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(short[] a, short val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			short amid = a[mid];
			if (key < amid)
				toIndex = mid;
			else if (key > amid)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(char[] a, char val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			char amid = a[mid];
			if (key < amid)
				toIndex = mid;
			else if (key > amid)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(int[] a, int val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			int amid = a[mid];
			if (key < amid)
				toIndex = mid;
			else if (key > amid)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(long[] a, long val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			long amid = a[mid];
			if (key < amid)
				toIndex = mid;
			else if (key > amid)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(float[] a, float val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			int cmp = Float.compare(key, a[mid]);
			if (cmp < 0)
				toIndex = mid;
			else if (cmp > 0)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(double[] a, double val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			int cmp = Double.compare(key, a[mid]);
			if (cmp < 0)
				toIndex = mid;
			else if (cmp > 0)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param val the value
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(Object[] a, Object val) {
		return binarySearch(a, 0, a.length, val);
	}

	/**
	 * Binary search for element in sorted array.
	 * @param a the sorted array
	 * @param fromIndex index of first element (inclusive) to consider
	 * @param toIndex index of last element (exclusive) to consider
	 * @param key the value to search for
	 * @return the index at which the element was found, or otherwise <code>(-index -1)</code> where <code>index</code>
	 * 	denotes the index at which the element should be inserted
	 */
	public static int binarySearch(Object[] a, int fromIndex, int toIndex, Object key) {
		Comparable key2 = (Comparable)key;
		while (fromIndex < toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			int cmp = key2.compareTo((Comparable)a[mid]);
			if (cmp < 0)
				toIndex = mid;
			else if (cmp > 0)
				fromIndex = mid+1;
			else
				return mid;
		}
		return -1 - fromIndex;
	}

	/****************** COPYOF ******************/

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static boolean[] copyOf(boolean[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		boolean[] b = new boolean[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static byte[] copyOf(byte[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		byte[] b = new byte[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static short[] copyOf(short[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		short[] b = new short[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static char[] copyOf(char[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		char[] b = new char[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static int[] copyOf(int[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		int[] b = new int[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static long[] copyOf(long[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		long[] b = new long[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static float[] copyOf(float[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		float[] b = new float[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * @param a the array to copy
	 * @param newLength length of the copy
	 * @return the copy of the array
	 */
	public static double[] copyOf(double[] a, int newLength) {
		int copyLength = (newLength > a.length) ? a.length : newLength;
		double[] b = new double[newLength];
		System.arraycopy(a, 0, b, 0, copyLength);
		return b;
	}

	/****************** COPYOFRANGE ******************/

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static boolean[] copyOfRange(boolean[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		boolean[] b = new boolean[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static byte[] copyOfRange(byte[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		byte[] b = new byte[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static short[] copyOfRange(short[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		short[] b = new short[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static char[] copyOfRange(char[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		char[] b = new char[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static int[] copyOfRange(int[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		int[] b = new int[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static long[] copyOfRange(long[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		long[] b = new long[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static float[] copyOfRange(float[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		float[] b = new float[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/**
	 * Creates a copy with a given length of an array.
	 * The data is truncated/padded to the given length as necessary.
	 * Note that <code>toIndex</code> may be larger then <code>a.length</code>.
	 * @param a the array to copy
	 * @param fromIndex index of first element (inclusive) to copy
	 * @param toIndex index of last element (exclusive) to copy
	 * @return the copy of the array
	 */
	public static double[] copyOfRange(double[] a, int fromIndex, int toIndex) {
		int copyLength = ((toIndex > a.length) ? a.length : toIndex) - fromIndex;
		double[] b = new double[toIndex - fromIndex];
		System.arraycopy(a, fromIndex, b, 0, copyLength);
		return b;
	}

	/****************** EQUALS ******************/

	public static boolean equals(boolean[] a, boolean[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] != b[i])
					return false;
		}
		return true;
	}

	public static boolean equals(byte[] a, byte[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] != b[i])
					return false;
		}
		return true;
	}

	public static boolean equals(short[] a, short[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] != b[i])
					return false;
		}
		return true;
	}

	public static boolean equals(char[] a, char[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] != b[i])
					return false;
		}
		return true;
	}

	public static boolean equals(int[] a, int[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] != b[i])
					return false;
		}
		return true;
	}

	public static boolean equals(long[] a, long[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] != b[i])
					return false;
		}
		return true;
	}

	public static boolean equals(float[] a, float[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (Float.compare(a[i], b[i]) != 0)
					return false;
		}
		return true;
	}

	public static boolean equals(double[] a, double[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (Double.compare(a[i], b[i]) != 0)
					return false;
		}
		return true;
	}

	public static boolean equals(Object[] a, Object[] b) {
		if (a != b) {
			if (a.length != b.length)
				return false;
			for (int i=0; i<a.length; i++)
				if (a[i] == null ? b[i] != null : !a[i].equals(b[i]))
					return false;
		}
		return true;
	}

	/****************** FILL ******************/

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(boolean[] a, boolean val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(boolean[] a, int fromIndex, int toIndex, boolean val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(byte[] a, byte val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(byte[] a, int fromIndex, int toIndex, byte val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(short[] a, short val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(short[] a, int fromIndex, int toIndex, short val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(char[] a, char val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(char[] a, int fromIndex, int toIndex, char val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(int[] a, int val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(int[] a, int fromIndex, int toIndex, int val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(long[] a, long val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(long[] a, int fromIndex, int toIndex, long val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(float[] a, float val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(float[] a, int fromIndex, int toIndex, float val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(double[] a, double val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(double[] a, int fromIndex, int toIndex, double val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param val the value
	 */
	public static void fill(Object[] a, Object val) {
		fill(a, 0, a.length, val);
	}

	/**
	 * Set array elements to given value.
	 * @param a the array
	 * @param fromIndex index of first element (inclusive) to set
	 * @param toIndex index of last element (exclusive) to set
	 * @param val the value
	 */
	public static void fill(Object[] a, int fromIndex, int toIndex, Object val) {
		for (int i=fromIndex; i<toIndex; i++) {
			a[i] = val;
		}
	}

	/****************** SORT ******************/

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(byte[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(byte[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				byte temp = a[in];
				if (temp > a[in2]){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(short[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(short[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				short temp = a[in];
				if (temp > a[in2]){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(char[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(char[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				char temp = a[in];
				if (temp > a[in2]){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(int[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(int[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				int temp = a[in];
				if (temp > a[in2]){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(long[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(long[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				long temp = a[in];
				if (temp > a[in2]){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(float[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(float[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				float temp = a[in];
				if (Float.compare(temp, a[in2]) > 0){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(double[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(double[] a, int fromIndex, int toIndex) {
		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;
				double temp = a[in];
				if (Double.compare(temp, a[in2]) > 0){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 */
	public static void sort(Object[] a) {
		sort(a, 0, a.length);
	}

	/**
	 * Sort the specified array in ascending order.
	 * @param a the array to sort
	 * @param fromIndex index of first element (inclusive) to sort
	 * @param toIndex index of last element (exclusive) to sort
	 */
	public static void sort(Object[] a, int fromIndex, int toIndex) {
		//The JDK's implementation doesn't take care of null values
		//and simply assumes that the object implement comparable.
		//So we do the same.

		// outer loop (backward)
		for (int out = toIndex - 1; out > fromIndex; out--){
			// inner loop (forward)
			for (int in = fromIndex; in < out; in++){
				int in2 = in + 1;

				Comparable temp = (Comparable)a[in];
				if (temp.compareTo((Comparable)a[in2]) > 0){ // out of order?
					a[in] = a[in2];
					a[in2] = temp;
				}
			}
		}
	}

	/****************** TOSTRING ******************/

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(boolean[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(byte[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(short[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(char[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(int[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(long[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(float[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(double[] a) {
		return java.lejosutil.Arrays.toString(a);
	}

	/**
	 * Returns a String representation of the array.
	 * @param a the array to convert
	 */
	public static String toString(Object[] a) {
		return java.lejosutil.Arrays.toString(a);
	}
}
