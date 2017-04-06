create database SA120974_MH110184;

use SA120974_MH110184;

create table docentes (
	id INT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(50) not null,
	last_name VARCHAR(50) not null,
	email VARCHAR(50) not null,
	gender VARCHAR(50) not null,
	username VARCHAR(50) UNIQUE not null,
	password VARCHAR(50) not null
);
insert into docentes (first_name, last_name, email, gender, username, password) values ('Stephen', 'Andrews', 'sandrews0@intel.com', 'Male', 'sandrews0', '463fc5035f88d4e752578e0908cb017d');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Lori', 'Daniels', 'ldaniels1@time.com', 'Female', 'ldaniels1', 'd586153adf2b41c3638b336d95b10bf0');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Juan', 'Matthews', 'jmatthews2@yandex.ru', 'Male', 'jmatthews2', 'f03831201a0dabc1767a6fc11533f9cc');
insert into docentes (first_name, last_name, email, gender, username, password) values ('John', 'Gardner', 'jgardner3@gmpg.org', 'Male', 'jgardner3', '20602082f2fd1cfdeeafb5f84fb515e5');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Patrick', 'King', 'pking4@fc2.com', 'Male', 'pking4', 'e95cc4f09a0720d41e6cadbcfae2acc7');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Juan', 'Shaw', 'jshaw5@chron.com', 'Male', 'jshaw5', '3bda42a58f55e8c7e8f508a0d029622b');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Sharon', 'Green', 'sgreen6@cnbc.com', 'Female', 'sgreen6', '4ff411dd4638de0450fd6a6b43222487');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Brenda', 'Cole', 'bcole7@gnu.org', 'Female', 'bcole7', '838dabd7457f6aa9954dadb7f4684b35');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Dorothy', 'Phillips', 'dphillips8@blogspot.com', 'Female', 'dphillips8', '78acbd02f9e3fca862fb6b4687f870cd');
insert into docentes (first_name, last_name, email, gender, username, password) values ('Angela', 'Cox', 'acox9@meetup.com', 'Female', 'acox9', 'd0515f1fefb8c5942c934d2f35969545');

create table estudiantes (
	id INT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	gender VARCHAR(50) NOT NULL,
	username VARCHAR(50) UNIQUE NOT NULL,
	password VARCHAR(50) NOT NULL
);
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Frances', 'Johnson', 'fjohnson0@state.tx.us', 'Female', 'fjohnson0', '2c0c505fc5a1cde28c295492be492026');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Diane', 'Tucker', 'dtucker1@tinyurl.com', 'Female', 'dtucker1', '6343d2eb86672429d4f570db5e35b5aa');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Teresa', 'Warren', 'twarren2@comsenz.com', 'Female', 'twarren2', 'e3faa833cf4bf4ed493dcf98c34157c6');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Alan', 'Richardson', 'arichardson3@foxnews.com', 'Male', 'arichardson3', '2561d81465a61384339322f59491f2e6');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Donna', 'Griffin', 'dgriffin4@examiner.com', 'Female', 'dgriffin4', '9c1e00faa9ec71779c30e4bdef7803c0');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Evelyn', 'Webb', 'ewebb5@hp.com', 'Female', 'ewebb5', '2fff2fe925978bf5ab6af7c81cf3009c');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('James', 'Rose', 'jrose6@ucla.edu', 'Male', 'jrose6', '77630583c2853505f2d48131e0499407');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Stephanie', 'Dixon', 'sdixon7@china.com.cn', 'Female', 'sdixon7', '2eda876d0bc4ef46b64ed777c84d9319');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Bruce', 'Perez', 'bperez8@phoca.cz', 'Male', 'bperez8', 'f79c98bcd5237efd6fdb58a8549eab8b');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Debra', 'Ferguson', 'dferguson9@artisteer.com', 'Female', 'dferguson9', 'a1a2fc6fe06bbe0b96d3399034cdbcc0');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Donna', 'Wagner', 'dwagnera@mail.ru', 'Female', 'dwagnera', 'b16e7ec6d97ce2e4656aa42f1ea317c9');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Michelle', 'Reed', 'mreedb@sitemeter.com', 'Female', 'mreedb', 'd5d33f96cec73f949af827c396a3aff4');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Craig', 'Harris', 'charrisc@youku.com', 'Male', 'charrisc', '7a13449e2be11e5da820310a97399cf8');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('James', 'Stevens', 'jstevensd@netvibes.com', 'Male', 'jstevensd', '85f6761d010e3d77ffc8711c00f56386');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Ashley', 'Adams', 'aadamse@businessweek.com', 'Female', 'aadamse', 'cf801896da78d2fd82c25d88fd544808');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Fred', 'Brooks', 'fbrooksf@google.pl', 'Male', 'fbrooksf', '84eb240212bba573309edfac50aa642e');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jerry', 'Austin', 'jausting@dell.com', 'Male', 'jausting', '91441969705a14537930da635764c57d');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Timothy', 'Andrews', 'tandrewsh@4shared.com', 'Male', 'tandrewsh', '1b940c99fa232d30317ee06cc4f6d0be');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Carolyn', 'Pierce', 'cpiercei@miitbeian.gov.cn', 'Female', 'cpiercei', 'c6e0479ef060be1700d9ec6eeb1507bf');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Amy', 'Stephens', 'astephensj@symantec.com', 'Female', 'astephensj', '06346789a10108d434ce06bcc6b50875');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Anna', 'Little', 'alittlek@yolasite.com', 'Female', 'alittlek', '35d7f6409f6923b5c0315b8bd44af1a1');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Victor', 'Moreno', 'vmorenol@instagram.com', 'Male', 'vmorenol', 'dc29401fe414af59d5ba2357648e67a3');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jason', 'Ray', 'jraym@acquirethisname.com', 'Male', 'jraym', '79fecae47869c47c3a82767367667800');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Frances', 'Freeman', 'ffreemann@guardian.co.uk', 'Female', 'ffreemann', 'e21dc682182c182e40c4d4d541f2cb81');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Robert', 'Montgomery', 'rmontgomeryo@surveymonkey.com', 'Male', 'rmontgomeryo', '7ee104c622ace1f4a34f8f866d92b660');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Linda', 'Henderson', 'lhendersonp@census.gov', 'Female', 'lhendersonp', 'a00c99b49b45b427e58f124dae5ebf28');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Amanda', 'Day', 'adayq@umn.edu', 'Female', 'adayq', '0e84f44d5a0eb14d37348da805f9dd52');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Linda', 'Rivera', 'lriverar@liveinternet.ru', 'Female', 'lriverar', 'f27bccafaf8bc4770a8e214f1cdac898');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('James', 'Wallace', 'jwallaces@arstechnica.com', 'Male', 'jwallaces', '0cbfc36c6e25d3699ea6f5de5d439b80');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Emily', 'Mitchell', 'emitchellt@guardian.co.uk', 'Female', 'emitchellt', '3d458d06efa86210b745ec7233b17b7f');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Louise', 'Burns', 'lburnsu@whitehouse.gov', 'Female', 'lburnsu', '95b15813878708512a111f7b1c9ee442');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Brenda', 'Hanson', 'bhansonv@canalblog.com', 'Female', 'bhansonv', '0f217ff35308616a86194c338431369b');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Janice', 'Rogers', 'jrogersw@tiny.cc', 'Female', 'jrogersw', 'f8a01e76d8b2aa5aa2954f3c4ad9939a');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jose', 'Hall', 'jhallx@patch.com', 'Male', 'jhallx', 'd796e28eda3d84270a4f3602d6e95284');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('James', 'Patterson', 'jpattersony@craigslist.org', 'Male', 'jpattersony', 'b899e8f30dab065303f74c55551e8cce');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Rose', 'Murphy', 'rmurphyz@springer.com', 'Female', 'rmurphyz', 'de414a45082a1ec30c25696ba778b7b1');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Wayne', 'White', 'wwhite10@ehow.com', 'Male', 'wwhite10', '01d3e9a9b7e8d6660a3758b3173ccfc6');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Maria', 'Martin', 'mmartin11@utexas.edu', 'Female', 'mmartin11', '092ff4c4fb61af1f2f8f3a6df5ba2b46');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Kathryn', 'Romero', 'kromero12@harvard.edu', 'Female', 'kromero12', 'aedeeb8ce3f633f9142bb5987b162e77');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Aaron', 'Chavez', 'achavez13@uol.com.br', 'Male', 'achavez13', 'd2f8859c42b190f1468f617eaaa90c6c');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jennifer', 'Turner', 'jturner14@youku.com', 'Female', 'jturner14', '007c8d81c22d67d4b995ce63bd73a5bd');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Fred', 'Patterson', 'fpatterson15@blogs.com', 'Male', 'fpatterson15', '0f832b2f5b259c97c8923631a82f9e47');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Thomas', 'Green', 'tgreen16@boston.com', 'Male', 'tgreen16', '5f9a7f8a94c3d9d43b8f5b52600755fe');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Roger', 'Rose', 'rrose17@a8.net', 'Male', 'rrose17', '835f4b9f2175daff9bed6fd4d340ee60');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Marie', 'Dixon', 'mdixon18@auda.org.au', 'Female', 'mdixon18', '6d48935185894ad3e0cac2b8c9d61583');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Henry', 'Alexander', 'halexander19@google.co.uk', 'Male', 'halexander19', 'f254186c0b22d6017a4eea6f2c9cd718');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Andrew', 'Spencer', 'aspencer1a@businesswire.com', 'Male', 'aspencer1a', '1280f14c882e9286b0484e308385dc41');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Elizabeth', 'Schmidt', 'eschmidt1b@drupal.org', 'Female', 'eschmidt1b', '6c5e338937109e2c48b4807d44f4785b');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Mildred', 'Shaw', 'mshaw1c@163.com', 'Female', 'mshaw1c', '380f5944fe11c6d4f249b15dfd63fdce');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Mildred', 'Wilson', 'mwilson1d@slate.com', 'Female', 'mwilson1d', '943a569dc1246ec2402cad066f8352d0');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Rachel', 'Nguyen', 'rnguyen1e@feedburner.com', 'Female', 'rnguyen1e', '3daa9afbf3fd167f6031ab21e21586bc');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Roger', 'Adams', 'radams1f@house.gov', 'Male', 'radams1f', '1c75695b26eedd032f731e68d7222521');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Douglas', 'Ward', 'dward1g@constantcontact.com', 'Male', 'dward1g', 'ab4b81805ecf61631f337ffd40a031ac');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Johnny', 'Stevens', 'jstevens1h@berkeley.edu', 'Male', 'jstevens1h', '3580b5570d1c9c43ce2a8636a80d26d9');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Heather', 'Fowler', 'hfowler1i@bbb.org', 'Female', 'hfowler1i', 'dc77b60ea665c17f5ed8703fd90ac907');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Nicholas', 'Snyder', 'nsnyder1j@issuu.com', 'Male', 'nsnyder1j', '84990367306cf2570dadff6b5d9b7a69');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Patricia', 'Perez', 'pperez1k@nyu.edu', 'Female', 'pperez1k', 'b1a0d2f1f1d495136be3e21993591def');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Mary', 'Austin', 'maustin1l@auda.org.au', 'Female', 'maustin1l', '4c3045383b2701252571f7d7e12ab8f9');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Albert', 'Mason', 'amason1m@360.cn', 'Male', 'amason1m', '88cc4a4f239819243f1c8aaf9d72c367');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Sean', 'Bell', 'sbell1n@state.tx.us', 'Male', 'sbell1n', '809f87e508d097abf962d4e69ef23075');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jason', 'Stevens', 'jstevens1o@cam.ac.uk', 'Male', 'jstevens1o', 'ea1f0364b4235050acd3c9089b72d915');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Ruby', 'Rivera', 'rrivera1p@alexa.com', 'Female', 'rrivera1p', '12fdb348a0247792d2f0071de092988e');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Howard', 'Black', 'hblack1q@oracle.com', 'Male', 'hblack1q', 'e1a088d5c99f308e81a7aa4ce7c948cb');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Paul', 'Bell', 'pbell1r@springer.com', 'Male', 'pbell1r', '413fc563192dc519df9279170502d652');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jacqueline', 'Schmidt', 'jschmidt1s@blogger.com', 'Female', 'jschmidt1s', 'd424e3069c36c1408e1b4d4a28281c2d');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Marie', 'Henry', 'mhenry1t@aol.com', 'Female', 'mhenry1t', 'ab1479575092f48656830fef5ecbfe03');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Debra', 'Mendoza', 'dmendoza1u@example.com', 'Female', 'dmendoza1u', '61093c8bd92ff22b549739e31a846e6d');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Walter', 'Hunt', 'whunt1v@go.com', 'Male', 'whunt1v', '1add83be42758e382d1d0cbf8ec00f2c');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Diana', 'Howard', 'dhoward1w@delicious.com', 'Female', 'dhoward1w', '86a4074b0f59ccd28d58e188dd46c20e');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Philip', 'Reed', 'preed1x@eventbrite.com', 'Male', 'preed1x', '559113aa4278900da46583e60c2c4fc1');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Martha', 'Stewart', 'mstewart1y@auda.org.au', 'Female', 'mstewart1y', '1429ca08ec74e153066269b38a2da8be');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Irene', 'Ford', 'iford1z@si.edu', 'Female', 'iford1z', 'd27bb5be90df61c4c0c175e94beee765');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Craig', 'Ryan', 'cryan20@bloomberg.com', 'Male', 'cryan20', '2d91d6c981271356e03ae3049103d081');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Kelly', 'Reid', 'kreid21@mediafire.com', 'Female', 'kreid21', 'e8bebd1eb841dc62da83a568b91b6dca');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Roger', 'Ford', 'rford22@abc.net.au', 'Male', 'rford22', 'd111ea7b19eca384730954711660da8f');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Matthew', 'Murray', 'mmurray23@blog.com', 'Male', 'mmurray23', '2c13d6f82ab84f1ec17e9efe4b7fefd9');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jennifer', 'Hicks', 'jhicks24@hp.com', 'Female', 'jhicks24', '5f84eebecb05be315b6402089963ed4a');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Fred', 'Mills', 'fmills25@1und1.de', 'Male', 'fmills25', '9a15a0bf1e8dba4635fe05c79e2f170c');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Teresa', 'Kennedy', 'tkennedy26@privacy.gov.au', 'Female', 'tkennedy26', 'ab35e46bc8bfe0ab8eb5c11aef2afab0');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Joan', 'Long', 'jlong27@latimes.com', 'Female', 'jlong27', '2fbe653a7ed0f2a1a479b3f7f76ad7ca');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Ronald', 'Gonzales', 'rgonzales28@cmu.edu', 'Male', 'rgonzales28', '68f75870b79cd65ebdf832fe9e1da55f');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Betty', 'Kennedy', 'bkennedy29@diigo.com', 'Female', 'bkennedy29', 'dd4ae56c4e356591abf20e3095844ff1');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Janet', 'Gray', 'jgray2a@cnbc.com', 'Female', 'jgray2a', '7e9833b34d2a076b11fc29be575ca814');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Ryan', 'Holmes', 'rholmes2b@who.int', 'Male', 'rholmes2b', '43112116fdfea08536090858ec37dc51');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jean', 'Duncan', 'jduncan2c@berkeley.edu', 'Female', 'jduncan2c', '234a64ba672f5fa47a5f0d6abfe776c7');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Wayne', 'Russell', 'wrussell2d@google.es', 'Male', 'wrussell2d', '600689aab003deee5d2abac9b0ae166a');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Emily', 'Alvarez', 'ealvarez2e@issuu.com', 'Female', 'ealvarez2e', '66bbed1c4b8f9271cdddaf72b77f4349');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Jesse', 'Gilbert', 'jgilbert2f@soup.io', 'Male', 'jgilbert2f', '22de020b4b2b7e3c60f8a80c84ffacf9');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Ronald', 'Marshall', 'rmarshall2g@slashdot.org', 'Male', 'rmarshall2g', 'f2b6703d775f16a9680ba24baa07e794');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Karen', 'Knight', 'kknight2h@posterous.com', 'Female', 'kknight2h', '01489e638a30af88ed0ce5b2b8ffd5ba');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Kathy', 'Duncan', 'kduncan2i@mail.ru', 'Female', 'kduncan2i', 'ef310498a7c4aacb71223eb222f54045');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Richard', 'Rose', 'rrose2j@auda.org.au', 'Male', 'rrose2j', '70d5caa37ec55a5672200b7540fe8525');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Randy', 'Bailey', 'rbailey2k@list-manage.com', 'Male', 'rbailey2k', '4c81ae24e9d0b249f60c4927e2458ca4');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Janet', 'Bishop', 'jbishop2l@seesaa.net', 'Female', 'jbishop2l', '85a0267f59873aa029bedeaac5b84e26');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Kimberly', 'Fox', 'kfox2m@nymag.com', 'Female', 'kfox2m', '394edf8ee874060238b753fa15688024');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Charles', 'Cox', 'ccox2n@zimbio.com', 'Male', 'ccox2n', '4522976a9ec6f7f8b8eecf10ded6fd8b');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Chris', 'Rice', 'crice2o@dell.com', 'Male', 'crice2o', 'fd8b6bd5377676d469b74fe4ee491623');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Rose', 'Mason', 'rmason2p@clickbank.net', 'Female', 'rmason2p', '2d875b7f43d039063e7527c46aa7c682');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Heather', 'Bowman', 'hbowman2q@typepad.com', 'Female', 'hbowman2q', '62535f6d79bd9f48405efd5c2c8c6a4e');
insert into estudiantes (first_name, last_name, email, gender, username, password) values ('Paula', 'Warren', 'pwarren2r@answers.com', 'Female', 'pwarren2r', 'eabd7ff58b67e2f4b47f007be0f78042');

create table materias (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL
);

insert into materias (nombre) values ('Matematicas');
insert into materias (nombre) values ('Lenguaje');
insert into materias (nombre) values ('Sociales');
insert into materias (nombre) values ('Ciencias');
insert into materias (nombre) values ('Informatica');

create table docentes_materias (
	id INT PRIMARY KEY AUTO_INCREMENT,
	idDocente INT,
	idMateria INT,
	FOREIGN KEY (idDocente) REFERENCES docentes(id),
	FOREIGN KEY (idMateria) REFERENCES materias(id)
);

create table estudiantes_materias (
	id INT PRIMARY KEY AUTO_INCREMENT,
	idEstudiante INT,
	idMateria INT,
	FOREIGN KEY (idEstudiante) REFERENCES estudiantes(id),
	FOREIGN KEY (idMateria) REFERENCES materias(id)
);

create table actividadesAEvaluar(
	id INT PRIMARY KEY AUTO_INCREMENT,
	porcentaje INT NOT NULL
);

create table actividadesAEvaluar_materias(
	id INT PRIMARY KEY AUTO_INCREMENT,
	idActividadesAEvaluar INT,
	idMateria INT,
	FOREIGN KEY (idActividadesAEvaluar) REFERENCES actividadesAEvaluar(id),
	FOREIGN KEY (idMateria) REFERENCES materias(id)
);

create table notas (
	id INT PRIMARY KEY AUTO_INCREMENT,
	idActividadesAEvaluar INT,
	idEstudiante INT,
	nota DOUBLE(2,2) NOT NULL,
	FOREIGN KEY (idActividadesAEvaluar) REFERENCES actividadesAEvaluar(id),
	FOREIGN KEY (idEstudiante) REFERENCES estudiantes(id)
)