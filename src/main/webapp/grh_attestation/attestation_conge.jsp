<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC>
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%

 String SOM = (String) request.getAttribute("SOM");





%>

<TITLE>attestation de congé</TITLE>
<META name="ensam admin" content="attestation de congé">
<STYLE type="text/css">

body {margin-top: 0px;margin-left: 0px;}

#page_1 {position:relative; overflow: hidden;margin: 64px 0px 78px 9px;padding: 0px;border: none;width: 785px;}

#page_1 #p1dimg1 {position:absolute;top:0px;left:16px;z-index:-1;width:747px;height:872px;}
#page_1 #p1dimg1 #p1img1 {width:747px;height:872px;}




.dclr {clear:both;float:none;height:1px;margin:0px;padding:0px;overflow:hidden;}

.ft0{font: bold 37px 'Times New Roman';line-height: 42px;}
.ft1{font: bold 21px 'Calibri';line-height: 26px;}
.ft2{font: bold 16px 'Calibri';line-height: 19px;}
.ft3{font: 16px 'Calibri';line-height: 19px;}
.ft4{font: 1px 'Calibri';line-height: 1px;}
.ft5{font: bold 16px 'Calibri';text-decoration: underline;line-height: 19px;}
.ft6{font: 16px 'Calibri';text-decoration: underline;line-height: 19px;}
.ft7{font: 19px 'Calibri';line-height: 23px;}
.ft8{font: 15px 'Calibri';line-height: 18px;}

.p0{text-align: left;padding-left: 160px;margin-top: 204px;margin-bottom: 0px;}
.p1{text-align: left;padding-left: 103px;margin-top: 20px;margin-bottom: 0px;}
.p2{text-align: left;padding-left: 338px;margin-top: 2px;margin-bottom: 0px;}
.p3{text-align: left;padding-left: 85px;padding-right: 107px;margin-top: 17px;margin-bottom: 0px;text-indent: 19px;}
.p4{text-align: left;padding-left: 85px;padding-right: 129px;margin-top: 20px;margin-bottom: 0px;text-indent: 19px;}
.p5{text-align: left;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
.p6{text-align: left;padding-left: 80px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
.p7{text-align: right;padding-right: 57px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
.p8{text-align: left;padding-left: 29px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
.p9{text-align: left;padding-left: 369px;margin-top: 56px;margin-bottom: 0px;}
.p10{text-align: left;padding-left: 168px;margin-top: 155px;margin-bottom: 0px;}
.p11{text-align: left;padding-left: 305px;margin-top: 16px;margin-bottom: 0px;}

.td0{padding: 0px;margin: 0px;width: 151px;vertical-align: bottom;}
.td1{padding: 0px;margin: 0px;width: 81px;vertical-align: bottom;}
.td2{padding: 0px;margin: 0px;width: 221px;vertical-align: bottom;}
.td3{padding: 0px;margin: 0px;width: 17px;vertical-align: bottom;}
.td4{padding: 0px;margin: 0px;width: 232px;vertical-align: bottom;}
.td5{padding: 0px;margin: 0px;width: 313px;vertical-align: bottom;}
.td6{padding: 0px;margin: 0px;width: 229px;vertical-align: bottom;}
.td7{padding: 0px;margin: 0px;width: 148px;vertical-align: bottom;}

.tr0{height: 20px;}
.tr1{height: 37px;}
.tr2{height: 40px;}
.tr3{height: 18px;}

.t0{width: 470px;margin-left: 104px;margin-top: 16px;font: 16px 'Calibri';}
.t1{width: 690px;margin-top: 15px;font: 15px 'Calibri';}

</STYLE>
<!-- To remove the JavaScript and access tabular data, please reach out to BCL at pdf2html@bcltechnologies.com -->
<script language="JavaScript">
function Il1l1lIl1I11Ill1I1I1ll1l1(Illll11l111Ill1lllIl1l11l)
{
	var l1I1IlIIIl1IlI1ll11I11l1I = document.getElementById(Illll11l111Ill1lllIl1l11l);
	for(var lIl1l1l1I1l11lIl11I11Illl = 0; lIl1l1l1I1l11lIl11I11Illl < l1I1IlIIIl1IlI1ll11I11l1I.childNodes.length; ++lIl1l1l1I1l11lIl11I11Illl)
	{
		if(l1I1IlIIIl1IlI1ll11I11l1I.childNodes[lIl1l1l1I1l11lIl11I11Illl].tagName == "TBODY")
		{
			l1I1IlIIIl1IlI1ll11I11l1I = l1I1IlIIIl1IlI1ll11I11l1I.childNodes[lIl1l1l1I1l11lIl11I11Illl];
			break;
		}
	}
	return l1I1IlIIIl1IlI1ll11I11l1I;
}

function IlIIl1Il1l1I11IlI1ll1II11(Il11I1Il1Il1I1lIllIlI11ll)
{
	var ll11111IIllII11I111lIIl1l = document.createElement("tr");
	if(Il11I1Il1Il1I1lIllIlI11ll >= 0)
		ll11111IIllII11I111lIIl1l.height = Il11I1Il1Il1I1lIllIlI11ll + "px";
	return ll11111IIllII11I111lIIl1l;
}

function lll1I111Illl1l1lI11lI1111(llI1llllIII1IIIllI11l111l, ll1I1II1IlIl1lIIIIIIlII1l, l1I1I1llI1I111IlIl1111lII, lIIIl1IIl1I111lll1l11lIlI)
{
	var l11I1l11I1I1ll1l1I11Il1I1 = document.createElement("td");
	if(llI1llllIII1IIIllI11l111l != 1)
		l11I1l11I1I1ll1l1I11Il1I1.rowSpan = llI1llllIII1IIIllI11l111l;
	if(ll1I1II1IlIl1lIIIIIIlII1l != 1)
		l11I1l11I1I1ll1l1I11Il1I1.colSpan = ll1I1II1IlIl1lIIIIIIlII1l;
	if(l1I1I1llI1I111IlIl1111lII != "")
		l11I1l11I1I1ll1l1I11Il1I1.className = l1I1I1llI1I111IlIl1111lII;
	if(lIIIl1IIl1I111lll1l11lIlI >= 0)
		l11I1l11I1I1ll1l1I11Il1I1.width = lIIIl1IIl1I111lll1l11lIlI + "px";
	return l11I1l11I1I1ll1l1I11Il1I1;
}

function lI1IllI111IlI1I1llll1lIIl()
{
	var l111I11l11II1I111II11Il1I = Il1l1lIl1I11Ill1I1I1ll1l1("lllI1lIII11llII1II1l1lI1l");
	var II11l11I1I1lIII11lIll1l11 = Il1l1lIl1I11Ill1I1I1ll1l1("l111l1llI1IIl1l1ll1lI1I11");
	var ll11IIl1II11l11l11lI11IlI = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var llIIll1lI1llI11lIl1IIII1l = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td1", -1);
	var l11111l1I1111llI1IlIllI1I = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td1", -1);
	var l11Il1lIlIIl11l1lIlIIl1II = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td3", -1);
	var lI11Il11II1IIII1IIll1lIl1 = lll1I111Illl1l1lI11lI1111(1, 1, "tr0 td0", -1);
	var I1I1l1I1ll11llIIIIIl1lIll = lll1I111Illl1l1lI11lI1111(1, 1, "tr3 td7", -1);
	var IlI1I111IlI1111lI1IllIIll = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td2", -1);
	var llll11111lIllllI1llII1111 = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td2", -1);
	var IIlIlIl1lII1IIl11l1III1Il = lll1I111Illl1l1lI11lI1111(1, 1, "tr2 td0", -1);
	var llIIl111III11l1Il111I11ll = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td3", -1);
	var IIl1111lIIlIlIll1lII1l1Il = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td3", -1);
	var II1IlIl11I1IllIlll1lIIllI = lll1I111Illl1l1lI11lI1111(1, 1, "tr2 td3", -1);
	var lIlIlI1lI1lIlIIllIlI1IlII = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td2", -1);
	var IIIIII1lIllllllIl1IIllIIl = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var lII1l1lII1II1llII1Illlll1 = lll1I111Illl1l1lI11lI1111(1, 1, "tr3 td5", -1);
	var lllllIlIlIIlIIIl1lllIllIl = lll1I111Illl1l1lI11lI1111(1, 1, "tr0 td2", -1);
	var IllI11l11l1I11llII1IllIlI = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td3", -1);
	var Il11I1lI1l1lIIll111l1IIlI = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var II1lllIl1lllIlIl1llIlI1l1 = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td1", -1);
	var llI1ll1lll1ll1I111I1IlIlI = lll1I111Illl1l1lI11lI1111(1, 1, "tr3 td6", -1);
	var ll1llllll111I1IIlIIIII1I1 = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var lI1lllll111lIIllIllI1Il11 = lll1I111Illl1l1lI11lI1111(1, 1, "tr2 td2", -1);
	var lI1I11lIIII11llI1II1l11II = lll1I111Illl1l1lI11lI1111(1, 1, "tr0 td1", -1);
	var IlI111lIlI1l1lIlIl111Il1l = lll1I111Illl1l1lI11lI1111(1, 2, "tr1 td4", -1);
	var l1I1ll11llI1IIl11l1IlII11 = lll1I111Illl1l1lI11lI1111(1, 1, "tr0 td3", -1);
	var l1llI1III11Il11IlI1ll1l1l = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var I1IlIlIl1IIlI1IlII1l1I1l1 = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td0", -1);
	var IIIlIlI1I1l1IlllIIlIl1lII = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var IIIIl1Il1IllI1II1ll1llIlI = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td0", -1);
	var l11l11lI1l1lIll1IIl1Il11l = lll1I111Illl1l1lI11lI1111(1, 1, "tr2 td1", -1);
	var ll1II1IllIllIIIIllI1ll11I = IlIIl1Il1l1I11IlI1ll1II11(-1);
	var l111l1Il1IlIlIl1l11lI1ll1 = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td2", -1);
	var l1IIll1l1lI1lIl1IllI1llII = lll1I111Illl1l1lI11lI1111(1, 1, "tr1 td0", -1);
	llIIl111III11l1Il111I11ll.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	lIlIlI1lI1lIlIIllIlI1IlII.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	l1IIll1l1lI1lIl1IllI1llII.innerHTML = "<P class=\"p5 ft3\">est accordé à </P>";
	lI11Il11II1IIII1IIll1lIl1.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	IlI111lIlI1l1lIlIl111Il1l.innerHTML = "<P class=\"p5 ft3\"><SPAN class=\"ft6\">Art 1 :</SPAN> * Un congé administratif</P>";
	II1IlIl11I1IllIlll1lIIllI.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	l11111l1I1111llI1IlIllI1I.innerHTML = "<P class=\"p7 ft3\">:</P>";
	IIlIlIl1lII1IIl11l1III1Il.innerHTML = "<P class=\"p8 ft3\">SOM</P>";
	lI1lllll111lIIllIllI1Il11.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	IllI11l11l1I11llII1IllIlI.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	I1IlIlIl1IIlI1IlII1l1I1l1.innerHTML = "<P class=\"p8 ft3\">Grade</P>";
	I1I1l1I1ll11llIIIIIl1lIll.innerHTML = "<P class=\"p5 ft8\">Fax : 00 212 522 562 093</P>";
	l111l1Il1IlIlIl1l11lI1ll1.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	llIIll1lI1llI11lIl1IIII1l.innerHTML = "<P class=\"p7 ft3\">:</P>";
	l11Il1lIlIIl11l1lIlIIl1II.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	IlI1I111IlI1111lI1IllIIll.innerHTML = "<P class=\"p6 ft3\">du</P>";
	II1lllIl1lllIlIl1llIlI1l1.innerHTML = "<P class=\"p7 ft3\">:</P>";
	llI1ll1lll1ll1I111I1IlIlI.innerHTML = "<P class=\"p5 ft8\">Tél. : 00 212 522 564 222</P>";
	llll11111lIllllI1llII1111.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	lI1I11lIIII11llI1II1l11II.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	IIIIl1Il1IllI1II1ll1llIlI.innerHTML = "<P class=\"p8 ft3\">Nom et Prénom</P>";
	lII1l1lII1II1llII1Illlll1.innerHTML = "<P class=\"p5 ft8\">Av. Nile, 150, Grand Casablanca – Maroc</P>";
	IIl1111lIIlIlIll1lII1l1Il.innerHTML = "<P class=\"p5 ft3\">au</P>";
	l11l11lI1l1lIll1IIl1Il11l.innerHTML = "<P class=\"p7 ft3\">:</P>";
	l1I1ll11llI1IIl11l1IlII11.innerHTML = "<P class=\"p5 ft4\">&nbsp;</P>";
	lllllIlIlIIlIIIl1lllIllIl.innerHTML = "<P class=\"p5 ft5\">Arrête ce qui suit :</P>";
	IIIlIlI1I1l1IlllIIlIl1lII.appendChild(lI11Il11II1IIII1IIll1lIl1);
	IIIlIlI1I1l1IlllIIlIl1lII.appendChild(lI1I11lIIII11llI1II1l11II);
	IIIlIlI1I1l1IlllIIlIl1lII.appendChild(lllllIlIlIIlIIIl1lllIllIl);
	IIIlIlI1I1l1IlllIIlIl1lII.appendChild(l1I1ll11llI1IIl11l1IlII11);
	II11l11I1I1lIII11lIll1l11.appendChild(IIIlIlI1I1l1IlllIIlIl1lII);
	Il11I1lI1l1lIIll111l1IIlI.appendChild(IlI111lIlI1l1lIlIl111Il1l);
	Il11I1lI1l1lIIll111l1IIlI.appendChild(IlI1I111IlI1111lI1IllIIll);
	Il11I1lI1l1lIIll111l1IIlI.appendChild(IIl1111lIIlIlIll1lII1l1Il);
	II11l11I1I1lIII11lIll1l11.appendChild(Il11I1lI1l1lIIll111l1IIlI);
	ll1II1IllIllIIIIllI1ll11I.appendChild(l1IIll1l1lI1lIl1IllI1llII);
	ll1II1IllIllIIIIllI1ll11I.appendChild(l11111l1I1111llI1IlIllI1I);
	ll1II1IllIllIIIIllI1ll11I.appendChild(llll11111lIllllI1llII1111);
	ll1II1IllIllIIIIllI1ll11I.appendChild(l11Il1lIlIIl11l1lIlIIl1II);
	II11l11I1I1lIII11lIll1l11.appendChild(ll1II1IllIllIIIIllI1ll11I);
	ll11IIl1II11l11l11lI11IlI.appendChild(IIIIl1Il1IllI1II1ll1llIlI);
	ll11IIl1II11l11l11lI11IlI.appendChild(llIIll1lI1llI11lIl1IIII1l);
	ll11IIl1II11l11l11lI11IlI.appendChild(l111l1Il1IlIlIl1l11lI1ll1);
	ll11IIl1II11l11l11lI11IlI.appendChild(IllI11l11l1I11llII1IllIlI);
	II11l11I1I1lIII11lIll1l11.appendChild(ll11IIl1II11l11l11lI11IlI);
	ll1llllll111I1IIlIIIII1I1.appendChild(I1IlIlIl1IIlI1IlII1l1I1l1);
	ll1llllll111I1IIlIIIII1I1.appendChild(II1lllIl1lllIlIl1llIlI1l1);
	ll1llllll111I1IIlIIIII1I1.appendChild(lIlIlI1lI1lIlIIllIlI1IlII);
	ll1llllll111I1IIlIIIII1I1.appendChild(llIIl111III11l1Il111I11ll);
	II11l11I1I1lIII11lIll1l11.appendChild(ll1llllll111I1IIlIIIII1I1);
	l1llI1III11Il11IlI1ll1l1l.appendChild(IIlIlIl1lII1IIl11l1III1Il);
	l1llI1III11Il11IlI1ll1l1l.appendChild(l11l11lI1l1lIll1IIl1Il11l);
	l1llI1III11Il11IlI1ll1l1l.appendChild(lI1lllll111lIIllIllI1Il11);
	l1llI1III11Il11IlI1ll1l1l.appendChild(II1IlIl11I1IllIlll1lIIllI);
	II11l11I1I1lIII11lIll1l11.appendChild(l1llI1III11Il11IlI1ll1l1l);
	IIIIII1lIllllllIl1IIllIIl.appendChild(lII1l1lII1II1llII1Illlll1);
	IIIIII1lIllllllIl1IIllIIl.appendChild(llI1ll1lll1ll1I111I1IlIlI);
	IIIIII1lIllllllIl1IIllIIl.appendChild(I1I1l1I1ll11llIIIIIl1lIll);
	l111I11l11II1I111II11Il1I.appendChild(IIIIII1lIllllllIl1IIllIIl);
}

</script>
</HEAD>

<BODY onload="window.print();lI1IllI111IlI1I1llll1lIIl()" >
<DIV id="page_1">
<DIV id="p1dimg1">
<IMG src="data:image/png;base64,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XnXHBsf85/3zOpQWL1zTNObIPbfg8NuWfL6lJV+29U5p+ejbYP74nc/dec5n7/7mwOTnnjGDTj94txUNG70SU6K6a/nSpUsLd3884jPL65vb/4OfD6Fbp0ybhZeMOWnObWfv0rvbu2vae8cFtQ0/PKpX4e7kV94uTqdeWriqsKRbt24tG581p7V0WfHLL7+/ja22rjGZMzCVCifv+35K/nHKnMqSDZyUBEBcPhUF89r/vnr3xce/vWxNKpX69TOLHn3sydaPzp8///vX3LFDp8yy+uZDBvb+9kkHtLRs1p/Mgp7VPS45stfoQ7Y7cmB78+F+KB99G8xXjvlS659jjzri2m8eWrupHSjFqXDhjY8X7g476MCenctzmzojqWNJ0fppWFpa+sx1p40/f5/KDqV1jRs+EaxDcfrwQ4clt//3H/94d2V9Sz7fo/wDp8g1pzfrcJzS0uK/TJlduPvtL352TVM2hLCyIXvSV45IFt7xh4crOmzWgTUAfMJ9KgqmqKhocN/Ob91yyprGbMfykpNvnNHtq7849NzfnfBff+h72k27jrn/N5OWLl7dMPLAXf50xVffeO2N9EbOmiloc45x7969Lz331B9/66RhBx24tdb5n3QcTNtZgTfkzqmLFix4/5iSu8/bf8mqTZxeng/hlmcX3TD23vUfGnbQga+M/Y8BrQ71be2gPfsUbt/8p5erOmVCCEWpVOsVOHjnHg3ZtjuS8usdWpNtyd835f2tR8fu07Eh2xJCyDbnMpl1m4gefC3XsaRok0EGwCfftj8fTAghlUq9NeutDh0rlj5wXgjh0ceenPbmkhBCCC379O7cMVM87PN77DFgQAjh7y++VFxcHMImDv5oc0mjhQsXLnrn3c25zlFZh8z222/fuXPnTY786G6+65HWd8uLUi8sLu2YKdnY+IIe5SVf+O6Ds+76ZnJ378F7HbXX/27yWZ0ryq59YvF591/zlT173vuTtlc2eOa600qOurZPx7LW9ZBryV9zxp6Fu79/fnHH0qJ8PhSlU+f/9q93X7LuOOg/XHZ8j//zyzZXOUhtaBbdGe/U/vnx//nS4YeEEIYd/IXtbn+jub5hv922Lwz446Q3+nz445wA+AT6VBRMCKH1ZpUvH3Holzc0JpfLbebVFtef56148y5EkG1snjt7Tml52W677db+yI++F+mc373WNVPc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W48//vjzf3t+dd3qfv36zZgx48UXX+zfv/+dd97510l/feGFF/bZd5/7778/nU5XVVVNnTr1zTff7Nu377hx456b/NzMN99M1vOuu+7+66RJU6ZO2XfffQvfyV8nTZrxyoxOnTp169bt6aefHj58+Lnnnnvrrbc2NDTU1NSEEO68887JkyfPmDFjr732eu655x7906Ovvvbqc5OfW/juwl133fWiiy9+7dVXCy84bdq0xx577Pm/PZ8uSj///PNPTXwqGdyte7euXbsm7/jaa6/uscceIYTZs2c/+OCD1dXVS5cuve+++3bfffeuXbvOnj278BZVPXrMnj37hRde2HXXXW+99dbn//b83HlzBwwY8Mgjj0yaNGnWrFnJ69TW1p4zenTI53fbbbd/yX+VAGwF2/g2mN/85jc/ueKKPn36lJWVhRAGDRp04003/elPf3rwwQdnzpw5aNCg4cOG3fzrX2+/ww4hhDPOOOOll15KnnjiiSc2NTWVZd4/9+eUU07+yle+smDBgrffnv/3v/89Wfjtb3/7a1/7Wgghl8uNHTv2/1199YoVKzKZzNlnn50M6Nu3b68ddnj++eeTKPnNb35z6qmn/upXv5o1a9aYb49Jxhx//PEjR4587bXXQghPPPHERRdfnCw//7vfffTRR8syZYXTtmfMmDFz5syddtr5mWeenT59+siRI5PlydtNnTp19OjR995734477ph8nKqqqhBCEmfXXXfd2vq1w4cPDyE89dRTV1xxRQjh1FNPLSouSj7m6NGjp06dGkK48867rrnm2uQVQipccuklw4cPr62tPeWUk1vyLa23Zp1yysnLli975tlnk7/906dPP+qoo0III0eO/Oa3vpWMOfXUU9+aM+exxx679tpry8rKli1fNnLkyGXLl1VWVl5xxRW79O+/YsWKGTNmJINvu+22Sy65pKKyoqSkpLm5eeG7C88444yF7y4sHG9+yiknn3jiicn4Aw44YOTIkU8//fSEiRMvu+yyfv36lZSUNDU1LVu+LHlWSUnxn//858suu2zBggUjR44sy5SVlpYmX9f999//rW9965xzzkl+R2ecfvqnZ2MVwLZhWz6bOoRQUVFRXFJSXFwyePDgu+66u7GxcdqLLyYPDR069OKLLz799NO/ctxxfXfaKYSQyWRaT/FSWlqadE+isrLyRz/60QEHHPDspL8mfwhfffXVFStWLFmyZNKkSUcfffTMmTNnvPLKD37wg8JTrrrqqgEDBowaNWrUqFGHH374RRdfXFJSct5537nwwgunTZvWobw8GTZkyJCDDz549OjREyZMKCkpqXxvWrzyTKZr165lZWWFnSOZTOa222478cQThw0bNnHixOLitr++Hj16XPLDix555OE1a9ZkMplMJlNRUdG/f//S0tKePXvut//+3auqQgglJSVl723UqazsmNzo3KVL8vHLMmXl5ese/ezAgUOHDl34zjvJu5eVlXXo8IFZ+77+9f+oru6x/377TZo0aejQoWPGjJk6derfX3758/vv/+qrr+6+++4hhD0GDOi7446NjY2DBw8ePHjwf193XfItTZ8+/ac/+9kf7r574MCBhe88U16eyWQGDhw4cODAr371qz/+8Y9/9KMftX7HBx54YMRJJ/3yhhvKysqOPvqYVCpdlE5nysuTzWy77bbbQQcddPXVVxeeVVFRkUxUmMmU9+3bN1my4459y8vLkxkIu3btOnny5P/6r/9q9z8lAD5ZtvFtMCGEbHPzqlW1IYRVq2o7d+lSWL5i5crOnTuHEErLyspKS9d/4tKlS5ctW1a4W1dXd9ppp6+tr7//vnuTSz9eddVV55133qhR59xwww0hhMVLlrR5hdV1dd27VyW3O3bsmCkrCyEMGLD79773vb/97W/J8mnTpn3nO98Z+bWzn3322fXXYe68ea+//nrhbv/+/X/2s58NHz78qquuWn9wOp1euHDhvx104JVXXpn8bV68eHHhI7z22msH/tu/HXHEEW2eVVu7cunSJckXlWxfqe7x/jw0Z5x++h3jxj322GPJ3WXLlq1YsXz9t66oqGhubk52nF1zzTV7Dhp05plnFVby6quvPuecc84999w2zzr33HP71NQMGjRo0qRJhYXZ5ublyzfwFgVf/vKXZ77xxgMPPHD99devXr2q8KwlS5Y0NrY3m8vSpUsKB3T/5S+P/fGPf7zyyitDCLNnz7766qv79u37qT3cGyBK+W3a+eefP2LEiOT2448/HkJYvWpVcnfMmDFDhgzJ5/Ovv/p68j1kMpkJEyYkj67/zYQQVq9ePXbs2BDCww8/nM/ni4uLa2pq+vXrlwy+8HvfO/Oss1o//b777uteVZUs6dKly4QJE8aMGXP99dcn71VTU5PP56+88sp+/frV1NQUFxc/++yz119/fbJW+Xx+yJAh99xzT+t1aGpqSl62srJy8uTJhZVMbkyYMGGHHXYoDK6srGz9PZx//vmFkTfeeOOw4cPbfMwhQ4Zcfvnl+Xx+xIgRyY3k0X79+l155ZUrV65s/YJtvqXDDjts5cqVhYU1NTU1NTXJ+OjZp2QAABkWSURBVBDCkiVLbr755meffTYZUPhOko9TXV2dvF2b39cGfxHJ3UGDBiUvPmTIkDvvvGvs2LFHH31M62FdunRJblx++eXDhg9/5513Wr9OTU3N7bffvsMOO/zmt79t/covvvhiHoBIbPvbYJ78n/858sgjH3nkkcMOO6ympmbnz3ymV69e48ePHz169OTJk087/fS99937ggsuCCFkMpnjjz++V69eyRMPP/zwww8/vM2rnXXWWSGEXC733HPPZTKZefPmvf766126dBk/fnx1jx5t/hF/wgknFKXTI0aM2Gmnnfr37z9s2LAQQn19fQihoaEhGXPZZZfNnj173rx5V1xxxRlnnBFCmDJlSp8+fRYsWBBC+MEPf3jMMccWLnFw0003nXb66Wefffbll1++3377VVdXD95772HDhl133XXrf/CGhobhhxxy0EEH/eUvfwkhJBtjvvjFLyaP5rLrrkVw5JFHJh/z6quvvvTSS4855tg//OEPxxxzTOF1fv/731944YVFRUXZbHb4IYcMHTq09bvst99+vXr1mjhxYrJBa/z48TU1NfPmzZs1a1bh3OalS5d+/etfP+GEE9q89T777DNixIjly5e3/p6T39f999+/0d9oCBdeeGHh4N8QQjabnThxwjHHHFs4dTybff9KCytXrix80sIxRo1NTbfddts5o0aFEPr06TN06NDq6uo999yznTcF4BPFnLwAQHy2/W0wAMC2R8EAAPFRMJ9QU6dOnT179se9FgDwCaVgto7k/Oqt+MQ5c+bstNNOH+qlWl8VqP0TkreuNlcjav2J1qxZs7GH2rfJE5vbeVMAPg0UTHuSGWxDCFdddVVzc3Mul6vq0eOkk04KIfTq1WvNmjVr1qy54oorFi1alMx+G0I47rjjxo8fP3To0J49e/bs2fPnP//5+PHjq3r06NmzZ58+fUIIM2bMSB5K/gZXVVU9/fTTPd9z0cUXz549u6pHj/PPP3+XXXdNXvO1117r2bNncnu//fZLbpx00kldu3ZNSmXatGk9e/bs269fMtPugD322HnnnQsn5gwdOvTaa69Nbt95550D3puSf+LEiYVPOnjvvUMI48aNS062CiE0Nzcnq92rV69p06YlL5usZOHcqBDCTjvtVFNTU1i9iy6+uPBVzJ8/f8e+fat69Jg5c2YIYeLEiVVVVY888kgIoba2Nnnx4447Lhlc1WoSmhBCdXX1008/XXgomVpmzz33nDNnbgjh/vvvT940mUjmu9/9blVVVfIQAJ8WH/fp3J9ouw8YkNy45ppr6uvrm5qakusT5fP5ysrK1atX19fXX3nllflWk68kj9bU1EyZMiVZcuedd33hC1/I5/N7DR5cX19/5plnnnraae+8804+n09O+s3n80uWLBk2fPgvf/nLfD4/ffr0Nr+X6dOnF16/sEqVlZXdq6puv/32fD4/ZMiQMWPG5PP5V1999dFHH02ePmvWrNYjk9s333xzCGHChAnz589/7LHHCm/Rr1+/fD4/duzYgw8+OFlSX19/4oknrl616sYbbyx85DvvvKv1ih177LH77rtvNpudPn16sqR7VVVhDY8++phFixavXr06mfdl9wED9t1332OPPTb5vJWVlckEdG+//Xb+g/O+zJo1q/8uu+y7776F9Q8h1NfX19TUzJo1a/Xq1SGEpqamt96ak3zJNTU1/XfZ5cwzz9yc3ykA2wbbYDZLYX6R4uLiRx99dPz48cms/LlcLtnfcfnlly9atOgXv/jFmWeeGUKo7NjxqKOO6tOnz3PPPVdcXDRlypQBe+wx8403MpnM9y/8/u/vuKOwqSNRVVVVXFRU/t51BkIIyXMLd+vq6pLtH4VLPJ522umTn/3rf/zHf4QQfvvb3/7iF7/o2bPn22+/feSRR3avqiovL+/SpUsI4dprrz3ttNN36tfvrrvuTp7495dfHj58+Ftz5mzOp67s2HHUqFHJrH1lmczo0eckW5ISDz300E033VRUVJRcFuDWW2894ogjHrz/gd/ecksIYdy423v2rP7iF7+YTPW7ePHiKVOmPPTQQwsXLkw+0W677davX7/evXu3ed9DDz30jddff+mll+bPn58sufHGGwcMGJApLy8tLX3mmWcymUxJSUnfvjsms8Jst91201544e67797kJwJgm6Fg2tM6XApLjjzyyPO+8502FyI44YQTfvazK+++++5TTjklhFC3evWDDz44b968Aw44IISw+4ABF/3womTkLrvt0tjY+I9//OOqq65qfRmmNgrPLazA3Llz586dm0yFN378+Llz59z465saGhpmzZq1++675/P5ESNGJFPDLV2y5Oabb052Ql1zzTULFixYWVv7/67+fyGEVDq956BBxx577I9/9KPkakGbIzmcpbGh4eabb543b15heWVlZesLL1xyySVvvP76jb++6cc/+lEIoXPnzi+++OLbb7+d7MPKZbNXXHFF96qqZF7jysrK6S+/nCkvb3OFhLq6uoULF15yySXZbLawn2vUqFFLlixpqK/PZnMlJSWF+QBDCLNmzSopKbn8Jz9pvRCAbZ6Cac8xRx+dTA7721tuyWQyuVwuaZo1dXXJRPUFvXv3vu66/54yZcphhx2WLCn8Qc1mc+WZzMknn5Tcvemmm5oaG7t27drmvbK5XEtLy8bWpLi4OLlSY7IC119//bnnnnvQQV8YMmTIbb/7XXLIy8knnxxCmDp16sKFC0866aSy0tJcLvfOO++MGvWNi374wxnTp+dyuXxLSwjhhhtueOKJJz7w7u+1Wut1KC4urlu9+jvf+b+F44LbHGB7yCGHnHveeSGEGTNmJOVx4YUXHnbYoW+//faaNWtuueWWwYMH19TUvP32/HHjxv3yl7/cY489zjnnnKuvvjqJp7X1DZlMpvCaSSc9+eSTnTp12muvvS6//PLRo0cX1m3s2LFvv/12LpdNjgRqaGh47bXXpk6d+sTjT5x33nlDhwwZM2ZM4RrXAGz7Pu7dWJ90ycWcR40aldwdNGhQPp+/7777+u+ySz6fb2pquvHGG5OHdh8w4IcXXZTcPv7442tqaqqrq6+77rqHH3741NNOy+fzEyZMmDJlyjXXXBNCKBy0kRyAks/nzzzrrAceeCCfz8+fP3/3AQOqq6sLF0h66605yfvm8/kvfelL+Xx+r8GDk7sPP/zwsOHDk9fsXlX11FNPTZ48uUuXLplMZv78+bfffnthlXYfMGD69On33HNPNpvN5/OXX35568sAJZdJeuCBBy644ILCwsLxJckhNWeeeWbyoQpH2NTV1Y0YMSKEsPuAAS+++GJyuE8y8uGHH06umzhixIhsNjtq1DnJQ6tXr04OlOm/yy7V1dWFtxs0aFB1dfV5531n1KhzHn/88cI65/P5wgEx/XfZZdmyZfl8/p577gkh9OvX76235hTedP78+W0O0wFgG+aqAgBAfOxFAgDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4FG/muD0v+PM/dT0AADafbTAAQHzMaAcAxMc2GAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+CgYACA+CgYAiI+CAQDio2AAgPgoGAAgPgoGAIiPggEA4qNgAID4KBgAID4KBgCIj4IBAOKjYACA+KQG/ef4j3sdAADWefmqL23OMNtgAID4/H/qJhKnqsl/UgAAAABJRU5ErkJggg==" id="p1img1"></DIV>


<DIV class="dclr"></DIV>
<P class="p0 ft0">ATTESTATION DE CONGE</P>
<P class="p1 ft1">Le directeur de l’Ecole Nationale Supérieure d’Arts et Métiers de</P>
<P class="p2 ft1">Casablanca</P>
<P class="p3 ft3"><SPAN class="ft2">V</SPAN>u l’arrêté viziriel du 23/02/1992 portant réglementation sur les congés du personnel et les textes qui l’ont complété.</P>
<P class="p4 ft3"><SPAN class="ft2">V</SPAN>u le dahir n° 1.58.008 du 04 chaâban 1337(25/02/1958) portant statut général de la fonction publique et les textes qui l’ont complété<SPAN class="ft2">.</SPAN></P>

<TABLE id="l111l1llI1IIl1l1ll1lI1I11" cellpadding=0 cellspacing=0 class="t0"></TABLE>
<P class="p9 ft7">Signature</P>
<P class="p10 ft7">Ecole Nationale Supérieure d’Arts et Métiers – Casablanca</P>

<TABLE id="lllI1lIII11llII1II1l1lI1l" cellpadding=0 cellspacing=0 class="t1"></TABLE>
<P class="p11 ft8">Web : <NOBR>www.ensam-casa.ma</NOBR></P>
</DIV>
</BODY>
</HTML>
    