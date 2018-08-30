class Obachan {
  private int intelij_account_number;

  // Intelijアカウント番号をリクエスト
  public void requestIntelij(LicenseMaster person) {
    this.intelij_account_number = person.issueLicense("Intelij", 10000, "http://intelij.jp");
  }

  public int getIntelijAccountNumber() {
    return this.intelij_account_number;
  }
}
