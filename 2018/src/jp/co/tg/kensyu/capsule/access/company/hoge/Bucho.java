package jp.co.tg.kensyu.capsule.access.company.hoge;

/**
 * 部長です。
 * @author masaki
 *
 */
public class Bucho {
	public Bucho() {
		doOorruption();
	}

	/**
	 * 汚職を開始します。
	 */
	private void doOorruption() {
		System.out.println(this.getClass().getSimpleName() + ":汚職を始める。");
		DarkPart darksider = createDarkSide();
		darksider.doCamouflageWork();
	}

	/**
	 * 清掃を行います。
	 */
	public void doWash() {
		System.out.println(this.getClass().getSimpleName() + ":掃除を始める。");
		ExclusiveCleaningStaff staff = createExclusiveCleaningStaff();
		staff.doWash();
	}

	/**
	 * 暗部の人材を提供します。
	 * @return
	 */
	public DarkPart createDarkSide() {
		return new DarkPart();
	}

	/**
	 * 専属清掃人を提供します。
	 * @return
	 */
	public ExclusiveCleaningStaff createExclusiveCleaningStaff() {
		return new ExclusiveCleaningStaff();
	}


}
