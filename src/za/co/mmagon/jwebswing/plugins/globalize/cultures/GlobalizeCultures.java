/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.globalize.cultures;

import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * A list of all the cultures loaded from jquery.globalize (http://github.com/nje/jquery-glob , http://weblogs.asp.net/scottgu/jquery-globalization-plugin-from-microsoft)
 *
 * @author GedMarc
 * @since 28 Mar 2016
 */
public enum GlobalizeCultures
{
	af_ZA(),
	af,
	all,
	am_ET,
	am,
	ar_AE,
	ar_BH,
	ar_DZ,
	ar_EG,
	ar_IQ,
	ar_JO,
	ar_KW,
	ar_LB,
	ar_LY,
	ar_MA,
	ar_OM,
	ar_QA,
	ar_SA,
	ar_SY,
	ar_TN,
	ar_YE,
	ar,
	arn_CL,
	arn,
	as_IN,
	as,
	az_Cyrl_AZ,
	az_Cyrl,
	az_Latn_AZ,
	az_Latn,
	az,
	ba_RU,
	ba,
	be_BY,
	be,
	bg_BG,
	bg,
	bn_BD,
	bn_IN,
	bn,
	bo_CN,
	bo,
	br_FR,
	br,
	bs_Cyrl_BA,
	bs_Cyrl,
	bs_Latn_BA,
	bs_Latn,
	bs,
	ca_ES,
	ca,
	co_FR,
	co,
	cs_CZ,
	cs,
	cy_GB,
	cy,
	da_DK,
	da,
	de_AT,
	de_CH,
	de_DE,
	de_LI,
	de_LU,
	de,
	dsb_DE,
	dsb,
	dv_MV,
	dv,
	el_GR,
	el,
	en_029,
	en_AU,
	en_BZ,
	en_CA,
	en_GB,
	en_IE,
	en_IN,
	en_JM,
	en_MY,
	en_NZ,
	en_PH,
	en_SG,
	en_TT,
	en_US,
	en_ZA,
	en_ZW,
	es_AR,
	es_BO,
	es_CL,
	es_CO,
	es_CR,
	es_DO,
	es_EC,
	es_ES,
	es_GT,
	es_HN,
	es_MX,
	es_NI,
	es_PA,
	es_PE,
	es_PR,
	es_PY,
	es_SV,
	es_US,
	es_UY,
	es_VE,
	es,
	et_EE,
	et,
	eu_ES,
	eu,
	fa_IR,
	fa,
	fi_FI,
	fi,
	fil_PH,
	fil,
	fo_FO,
	fo,
	fr_BE,
	fr_CA,
	fr_CH,
	fr_FR,
	fr_LU,
	fr_MC,
	fr,
	fy_NL,
	fy,
	ga_IE,
	ga,
	gd_GB,
	gd,
	gl_ES,
	gl,
	gsw_FR,
	gsw,
	gu_IN,
	gu,
	ha_Latn_NG,
	ha_Latn,
	ha,
	he_IL,
	he,
	hi_IN,
	hi,
	hr_BA,
	hr_HR,
	hr,
	hsb_DE,
	hsb,
	hu_HU,
	hu,
	hy_AM,
	hy,
	id_ID,
	id,
	ig_NG,
	ig,
	ii_CN,
	ii,
	is_IS,
	is,
	it_CH,
	it_IT,
	it,
	iu_Cans_CA,
	iu_Cans,
	iu_Latn_CA,
	iu_Latn,
	iu,
	ja_JP,
	ja,
	ka_GE,
	ka,
	kk_KZ,
	kk,
	kl_GL,
	kl,
	km_KH,
	km,
	kn_IN,
	kn,
	ko_KR,
	ko,
	kok_IN,
	kok,
	ky_KG,
	ky,
	lb_LU,
	lb,
	lo_LA,
	lo,
	lt_LT,
	lt,
	lv_LV,
	lv,
	mi_NZ,
	mi,
	mk_MK,
	mk,
	ml_IN,
	ml,
	mn_Cyrl,
	mn_MN,
	mn_Mong_CN,
	mn_Mong,
	mn,
	moh_CA,
	moh,
	mr_IN,
	mr,
	ms_BN,
	ms_MY,
	ms,
	mt_MT,
	mt,
	nb_NO,
	nb,
	ne_NP,
	ne,
	nl_BE,
	nl_NL,
	nl,
	nn_NO,
	nn,
	no,
	nso_ZA,
	nso,
	oc_FR,
	oc,
	or_IN,
	or,
	pa_IN,
	pa,
	pl_PL,
	pl,
	prs_AF,
	prs,
	ps_AF,
	ps,
	pt_BR,
	pt_PT,
	pt,
	qut_GT,
	qut,
	quz_BO,
	quz_EC,
	quz_PE,
	quz,
	rm_CH,
	rm,
	ro_RO,
	ro,
	ru_RU,
	ru,
	rw_RW,
	rw,
	sa_IN,
	sa,
	sah_RU,
	sah,
	se_FI,
	se_NO,
	se_SE,
	se,
	si_LK,
	si,
	sk_SK,
	sk,
	sl_SI,
	sl,
	sma_NO,
	sma_SE,
	sma,
	smj_NO,
	smj_SE,
	smj,
	smn_FI,
	smn,
	sms_FI,
	sms,
	sq_AL,
	sq,
	sr_Cyrl_BA,
	sr_Cyrl_CS,
	sr_Cyrl_ME,
	sr_Cyrl_RS,
	sr_Cyrl,
	sr_Latn_BA,
	sr_Latn_CS,
	sr_Latn_ME,
	sr_Latn_RS,
	sr_Latn,
	sr,
	sv_FI,
	sv_SE,
	sv,
	sw_KE,
	sw,
	syr_SY,
	syr,
	ta_IN,
	ta,
	te_IN,
	te,
	tg_Cyrl_TJ,
	tg_Cyrl,
	tg,
	th_TH,
	th,
	tk_TM,
	tk,
	tn_ZA,
	tn,
	tr_TR,
	tr,
	tt_RU,
	tt,
	tzm_Latn_DZ,
	tzm_Latn,
	tzm,
	ug_CN,
	ug,
	uk_UA,
	uk,
	ur_PK,
	ur,
	uz_Cyrl_UZ,
	uz_Cyrl,
	uz_Latn_UZ,
	uz_Latn,
	uz,
	vi_VN,
	vi,
	wo_SN,
	wo,
	xh_ZA,
	xh,
	yo_NG,
	yo,
	zh_CHS,
	zh_CHT,
	zh_CN,
	zh_Hans,
	zh_Hant,
	zh_HK,
	zh_MO,
	zh_SG,
	zh_TW,
	zh,
	zu_ZA,
	zu,;

	private static final JavascriptReference coreReference = new JavascriptReference("Globalize Core Reference", 1.11, "bower_components/globalize/dist/globalize.min.js", 300);

	/**
	 * Returns the core reference
	 *
	 * @return
	 */
	public static JavascriptReference getJavascriptReference()
	{
		return coreReference;
	}

	@Override
	public String toString()
	{
		return name().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
