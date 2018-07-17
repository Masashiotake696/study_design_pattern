<?php
require_once('./Person.php');
require_once('./DtuMember.php');

// 初期メンバー
$ozs = new Person('ozs', 26);
$kurota = new Person('kurota', 40);
$ozi = new Person('ozi', 45);
$dtuMember = new DtuMember([$ozs, $kurota, $ozi]);

// 新しいメンバーを追加
$dtuMember->joinDtu((new Person('hasumin', 28)));
$dtuMember->joinDtu(new Person('kohe', 24));
$dtuMember->joinDtu(new Person('sakamoto', 24));

var_dump($dtuMember->getIterator()->getOzisan());
var_dump($dtuMember->getIterator()->getWakamono());
var_dump($dtuMember->getIterator()->getAll());
var_dump($dtuMember->getIterator()->getAllName());
