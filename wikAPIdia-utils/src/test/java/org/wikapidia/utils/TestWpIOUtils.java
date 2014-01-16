package org.wikapidia.utils;

import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

/**
 * @author Shilad Sen
 */
public class TestWpIOUtils {
    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {
        String hex = "aced0005757200025b460b9c818922e00c4202000078700000055b402a056a3ff3a176400797813ffba962401a234e3ff8e2093fef799d40369d60403ef48e4011aa844001c25240321b0a3fdd8e863ff8e599400d8398400a180240032f43402841f23fe5936d4016e1014010ffae3ff5bd3f401b645c3fe661fb40289c6e400222cd3fdb229f3ff38df440182ae73ff973e83ff7e56c400a930b401b6270400b62a640025eb640030c99402bc7dd3fdfe7324071865a4010f3b93fe8e3d73fe0c1263fe18afe401c3d57400060cb3feb44fe40043148401e28e93ffdbf613feff52c3ff6d1203ff1c4af40238aa040040f774020ba83401bbe9f402365b940025ddf3fe43cf93ff2f7224043759a4005515a400af950400a8d924007ddac4010aa633fe9ce4e40530708401cd9b23ff4e705400c5f79400ac2b43ff02c303fe6ec13400d94c93febd5d2407482714011f04b403c1cce3fe1049b3fff660040138d563ffbd5b5402733ba401bd7a84032a12b3fe0b0563fee4352403900a1400dcda24021c85040017d2940567ea84008c8ed40091f3c40224cf44020d33240026222400b10013ff90993402893803ffe70c7403ae100401e6b75402af9d5401725d93ff7305a4008be08400f9f9f3ff711544073c95e3fdeafd03fe8c6b640375da73ff7b5833fdb78a4402897db400e4ae8403ab57540072abf3fdd57e14017fa19400b0c52402dc64f4029cfab40012c0640093ba53ffe34fe400c63d8400578b73ffa48214009e58f401c88553fde5ed140126d7e400f18ea3fffff59401995574044359a3fec16fe4014c431404c3e5a3fe77c2640009e754000db9a400854ab408a636a3fe3f32a3fea55ff3feaa28c400e4a0140413e203ffd6f233fe6e7103ff7974e400265423ff3e9e6400af414405e2623401406ad401ca15c4028c8a0401df7d74040444f40132f51401d527c401346ee400c23f84003271740181aa73ff28ffd4006007d3fe5b0aa401725c6401ac8a44077ae433fdd5f3740129fad405e641d4007b84a3ffcdbd83ffeb2573ffecf0f4011df0b40046b21405e493340433b5b3fe9a2603fe29f0640320087401284d43fe2ea92404ac60b3ffe645c402908a43fe447e040148597401374d84005b3f3401087f4401377d6405d6e063feedb9b3fdf23143fdb6a934005c344401cfd5b3ff04071402d01733fe1230e3ffb02f9400e6bd53ff1140d3fe320013ff40799400570133ff3a70f3ff4e6ba3ff0faf540761d7e402270284021d0103ffe9835403d90c140079b2e4019b6c1402242ec3fe0b5673ffa51933ffc07bc4002241d3ff1457b3ff7b1f93ff3e0104034197140200f973fe7bc1c400ef6cb4007fce13fe9baff4010e7133ffdb7993fe2e9c83ffa80f74006053c3fefff81400e7a524019f97e4037a2253fefb1a43fdc09263fed01fd3fea81163ff110c83fefc6e9400026573fecb9de4002b6aa4014b4a3403e57233fedd6753ffd69d840552d8a400aeef640258f6440200475403708d1400c0bae401609913fe0f5ea3fea2fca3ff49f2c3ff8181a400cb18b3feaa4444018099d4017d1f7400f5f3a401276de400c69ac400a0d1e402898df402ef0994028b1014019a137405b10ef403b77d53ffe26d4407a25c44014411c401ee565400311de3fe60c3740459b023ff4155b4029e116401b764b3fe806ba401a03294008d86a3ff039ba4008c2f7404196a0401278ab4019b6123fe44abc40193063400e265d3ff8c9e44007855e3ffb103d400a80df3ff2da46401d2d9d401eb29640149ed23ffff437404978953fe23c1a3ffc2d7c4007039a3fe8fe343fde275d4025a94c3ff250a740380bd23fe78d4b3ff947e240141791401eb6644010bff940201adb400b48de403dd4f04044eb81401301bc3ffc4d0b4007628f40094511402a08c53ffaac8140009beb402ab27f3fee3e32401ac1693fe0ffd240054466402bf1ac40099ae33fdaa2e6400b3c5b4024f31c3fe7cbbc3fe7e7a53ffcd8a04007580b401c803b400cb4e54000fc353ff4b0754002def24008aebe3fec815340763b37402949294014960d40084915400de3b8401f22483fe8a6383ff7aa70400a2f2140349de63ffabcde3fde5eea4021ae50400a6699400e81a5402b91ef3ff999473feaeff04009e6894026038d404610a63ff7a35840395771401a4bf53fdbdfec3ff6d3f63ff7fddf4026774f3ffc0f8d402229863fe2eede4010c8b84000bf5e405285a94009334b40122b9640314e773ffede483ffbce5540170f933fefa0c54008315b3fea83ff3fece355400726063fea837740021a563fed73314037ef5e400885b34011b5da3ff367683ff5eece400308903ff3b76e40044b763ff7267e401b2cb04006223b3fea3a6a402aa353401ecbe5404da7ff3ff365c43feb4d5d3ff231cc401b8d923fee4cf33fea6dd24000d32c400b2c044009e47e3ff93be04042e2fc3fe262633fea52a1400b599f401e08be3ff435474016b20840195ac84004bc4e3ff089343fffc7b13ff45df84009ce603ff33d8d3ffdb87340089d024005af3d402df1683ff38f03402185e93fe2d7bf400eb51240022e21400ed7dc4002894d4026ba24400b814f400d5b893fe94d3a401258fc3fed53693fde3baa3ff8bbc4404074b73ff67058400d24d13fe32ef53fe851b24000b7403fec66c040028ff13fdf2b823febd9f53ff825953ff6f0d9401232433fe72ac3403fb5f54056d1cb3fe2e6c13ff442824002af3a4009c3974017c04e3fdbc20d3fdfd0d44032bfcf3fed2b014052b8cb401b78f03fe52a03401f3edf4016a86640007e4d4005a3f83ffb5f194012399040233dd04042cf0c3feec6083fdc8ec440170f094002ea1a3fec31d23fec4b424018b5f14001529e3fe84c4c4002f7384029e86f400a8291401e52194001174b3ff559bf401237c03ffef05f3ffd85ae4060161a4019e443400460f840616ba43fe98a4d3fff88533ff812c23ff4fbd14020cc80403df0ec3fe6a5ca4006800f400107ad402fcbbe400ca1da4016ad504005cb753fee90054009006d3ff93220401e43b0404dba2f3fe7ad2a4007a135400992533fda8eab402259244020984a3fe9b87c3ff808103fe32962402911b5400e88923fdfa7bb401b42264005609b4043dd9740152ed33fe7ffcf40135462400ff284400bb5c3402de0f7400496823fe0da953ff2841b3ff519653ffe342a40316c66400c2ff2400e783e3ffa037b402180493fe801483ffd40df3ff8b5bf4016f99d3fdea7843febb1b84069cd66402e3d763feb15f43fe545d940556af73ff2e04240338d063fe96f8d40029d9d400618503ffb88fb401575633ff97bab4018698d3ff842ea3fefc919400b977b40085b0b4004b82d401d6b38400b84643feeb9043fedfc0f402086af3ff78db840010eef3fe8d434402719874056a6133fff62233ff2adce3ff24f7240098fd1404b367840020e233ff8c575401d24414057855d400b4c7d3fe929253ffcc811400c851f3ffedc5d3fe0d07d401cc4153fe7169c3ff1a12840073fc34005f55e3feeafcb40032bed401d4b2c401fc6c53fee25be40162dcb400c9b5e4013f3444010c5303ff13b8e401f7a2d403354c2401100743ff8946f3fdbcbd24044c4353fe2d7ab3fe567c04004be853fe52cfa402501dd400b23c8402d0f334012f6b940026b723fefb4a0402c11d73ffccfe63ff57b533fffab3d4032de784004a9274003ea1f40044843402b81a84005a6c0402c62173fd8594c3ffe6c0640000a193ffd729b3ffdfceb403aa6d54006e9843fef42eb40146488402339e0401d27f33ff5efd74010547a402a306f403ee39a400c0be240592d59400b2c664035accd4024063b3ff1abe84000ec0f4000afe74000c87d3ff89ef33fe17bea400817954003723e40317b76402054534004abbc4003e3a340179fb8401387904040341a401fbd883fe12f16400d2f71400764e9407d0fae403430263fec712c400683b1400841bb3ff15c363fdeb8ea3fea0d633ff160d13fe5207c402bfda73ff3c2e74002164040020b183fe5f49a3fee32ac3fe753b24012eedd400403243ff7cfd2401bfba140171140400214c7402799f13fe063ae4016c49240022b723feac651400ef3e7402324a64025460d4009ccfc3fe2eb103ff702853fe40bcf400aef9a403d29904008b35c4007510e3fef0c8e3fff35363fe0416a4012c5873ff74a9e3fe6646a40111491400a704d4035d63a3fe026574007174640077ef93ff50c414006891c402174b940224930402e9c913fe85c23400858774033b79c400fc1ec3ff3d87d4043c7b7401dde7c400daf014009cc19401db18e401797d24005d3213fe871ec40287c6a400fcbca401265d0400851514005abb7400899e04062b47c3ff0940c401378323ff5c0b440413c5c40070d90402a1e624000a09140013474400e60e83fff33ac40051e1e3ff71ee04041d855406233ff401bcd273ffc9c4e401b05f34005d7844025f7184006bb56400b84d84005a36b3fe724713fe7e971401ab66a3fdf924d4012b45d3ff0b2633fe2c229400eb53c4016fab73ff50ec84032834e3fd8e6aa4002d8174006c2b840106804402589cb40638cf1401a22aa400ec74a3fe44e983fdea4874015526340219e9540147cfa4017529f400813cf403c7b0d401a8016406535c9401b28f140033a1a400412f2401719f04083c59b3ffa3e194036f7a83ff8198b401801f93ff5fa90400b6c963fedb76840726ee34022f1ad400da65b3fe2dd123ff8fdd4401766453fe122be40287dde3ff6f9423ff042803ff831a8403569133fe0c88a3fdcc72440073e3840020c804045cbd54002db29401e9c5f3fdde764404d756b3ff13b7a40080e98400d3613401ab8cc4011fdac40354a473fe5dcc73ff9a0494011ba7e3fecfd48400451d63feeafd24016b7bb40173d403fef1cd03ffaa2a63fe80a4940208aa43fef495b400e7764400023a3401c337f4019bcb3404a9f143ffae4b93fef4bbe4013129d400bc573401400c93ff1be47400a46704000474f404d859e40099f84400215f9401a14623ff464e24002822140020f2f4033fb074015c4643fe2c0844007865d3fe87a3a401443113fee0214403281d43febdf22400686593ffad58e3fe3ea7e3ffc7eac4022d2093ffe5e4b401c285040309a7640042e914016435a401500a0400787aa400eaaeb402675f03fec1468402735484074e013408516774018123d400ff4123ff5de923ffbb9774011d99b3ffbfb483fea40794048e54d40024e523fd995c9407787454004ee83402c1f083ff10320401d10ce3ffcf3333fe97e6a3fea52033fed704e3ff1fb943fffcf303ff2bbc24031c3b33ff961b740475331403519a03fe8bd7b40124e2b40169b334011d3a2406ff1104018f36d400296d23fd6dfdf3fed95ca3fef6bfe40379e6d3fe8cac93fe152604002a3e8401fc5363ff634e74000061e4003c1f5402f52134025cbb34011be47400d38f24032c5a24003a3e13fdfa4e63fe24050403561e03ffb5b40401bb7dc4001e28c3ff6c84c40206aa33fea4f9f3fe94d9040156458406ca2303fdfae54400215cc4006480f4004668a3fec13cb4003fb133ffeccd54003a1d1402017d7403e2082408cc321400e264a3fd959173fe5524d402dd809401376ce3fd97e0d400d942d401912593fdfba614038bf203ffe0024403cbc1c4005d8e63fe747003fe4d2c13ffeefe940266cdf3ff19bb93fefb62240064e5a3ff2cf28403182563fee7b8d4012700440052e5d404053d540105c1d401700d94027a89e400e8614400af2334007890f4014cb223ff8f26a405dbaa74001c71a401e78473fe97ff24002d2843ff7ee944008f54a4001ebe54000e91f40025147400cf32c400171a94000c2623fd7f89740253f92401ea35a40108d804001a7294007d51e3fe449ad4001f99e3fe32cc7403044ac3ffc5c73400d4232400a2e9f401efd7e403aa838402c8614400d744b4079c0094034df2d3fe4890c3fe24e58404b5a093fe632c43fe99e003fee49853fd96b463ff445ae3ffbaae8400a69a63ff84156401f385a400a4a0d4017e8c5402708ef4009225e400126ae3fe8bd7a3fed78c43fe935a53fefc2513fd954ca40095a3c3fff408f3fe9c8304004b9503feebe813fefe6304021b16c3fff0030401e2908400850cf4011e0684001be0b40111ca43fddd9cd3fe99a8b3fe468d73fe7a1ba3fe866483ff1d3cf4029d442401bb1963fdcb78c3ff1c1213fe824ec4011be5740013e0240034e1c401318674014cbbd401be9db3ff58de1402622734028668f4018b78f4009d77f401c7d3f406fe5cb4079cd243ff30417400b34e83fe50e743fe5407c4022509f40175e19402430834024a4073fe041893ffcec273ff8c6ae402e7ce03fe313c9401923633fee42753fffc6334055997e4021d36b3fedc27d405069934003c4cc401cf0a33fe220034001f5183fe37d8b40064c4540204d5f40129c534013ece3400662bd40047cbf3ff6d9a44011f2a0400091024005c4dc3ff15cb13fde86ef3ff440dc3ffe40953fed28ee3feeb0373fe0ae7b4002fd5f3ffedd8c402f37b93fea94b04020b8c23ff42f60405f05d74035a400406780ca402213a63fe598383ff5150c405d29ca3ff357693fe712d740202fcb401e65243fe4546c4013e5753fe266374012716f3fec440c400fb1504016eb023fec02ea3ff218ab3ff700fb3feae7854003c2734016b2683fef8f5d402022513ffc23d73ff37fe93ffe0ba73fe506623fdb303d4031a39d3ffe23fc400537893ffc888d403a67d03ff7c6514045884f401a3922401c5a443fe3ef20400418cb3ff06f7a3ffb5733401a3a01400a0a133fe129383fd5c683400e17e64012e94d4029f3913ff507ef3ffcc9a13fe1aa11400156be402015cf401293d2403388c84037a3143ffc3ce0401917633feccb17400a26d33ff8bf003fe274914007fdae4007dece4009ee544020e584402c77ff3fe67772400759bd400c43903ff2f8113ffa38c73ff05ddd3ff4d6ba40186783400635854000028e3feec1e2405462cb3fea7602400ba81c3ffeef87401c7b4b400bd2ca401139443ff4ef3e400c79af401919743fe8184b40027447409314f3403d5aec403032d43ff254024032d8eb4006380040282e984004c8364005d319403be909402bacc33fde28c43fe2ffa6400113eb3fea4f48400d66eb3fe48f8b3ff3b4c64013b3ea40065e95400240233fd2f22a40a4aa9e4011978740149efd3ff5e4573ff5f9f84000cd9f40088978400dd5e5401ebbc53ff4c3c540184ede3ff3c88240155d4b3fe11a53400908c2401a5fbb3ff3cd933fe082053fe439e03ffd5c353fd84f0440307ea83ff5ee0b40108cf0400139a7401428d040135e053ff6f0274009099140035b9d4013ac253ffe022840392771400fd5f840264d5840125757401e5ab53ffc7d99402bdda7400f07ba3fca60f4402c65ac3feb32da400018944014068c3fe5dfb5400ed275400dcd7b401ae088400721db40011fc94002f5da400217e34004230b400ff0b04010e37f3ffd41be40086e5d400dd4d23fea925640340aac40225779401aeadb40005c28400025f9402be9a63fe39c3f400184ce3ff30fbf400114e2400d019f40129f563ff7e7ac3fe3df8e401168253ffb33bb";
        byte[] bytes = DatatypeConverter.parseHexBinary(hex);
        float f[] = (float[]) WpIOUtils.bytesToObject(bytes);
        System.out.println("f.length is " + f.length);
        for (int i = 0; i < 100; i++) {
            System.out.println("byte " + i + " is " + bytes[i]);
        }
    }
}
