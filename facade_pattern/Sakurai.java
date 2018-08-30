class Sakurai implements LicenseMaster {
  public int issueLicense(String name, int money, String url) {
    LegalAffair legalAffair = new LegalAffair();
    if(!legalAffair.checkSite(url)) {
      System.out.println("違法サイトって言われたんだけど...");
    }

    Accounting accounting = new Accounting();
    if(!accounting.checkMoney(money)) {
      System.out.println("高すぎるって...");
    }

    Intelij intelij = new Intelij();
    return intelij.newLisence(name);
  }
}
