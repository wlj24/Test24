package comuter;

  class TRY {
	public int aaa() {
		int x = 1;

		try {
			return ++x;
		} catch (Exception e) {

		} finally {
			++x;
		}
		return x;
	}

	public static void main (String args[]) {
		TRY t = new TRY();
		int y = t.aaa();
		System.out.println(y);
	}

 }
