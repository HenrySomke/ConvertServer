package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 出院小结子集
 */
public class HDSD00_16_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_16_01(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <!--***************************************************\n" +
                        "  文档头Head\n" +
                        "  *******************************************************\n" +
                        "  -->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.73\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0053\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>出院小结</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "\n" +
                        "  <!--文档记录对象（患者） [1..*] contextControlCode=\"OP\"表示本信息可以被重载-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--健康卡号-->\n" +
                        "      <id root=\"2.16.156.10011.1.19\" extension=\"" + cdaData.getCustomCol("DE01.00.021.00") + "\"/>\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <!-- 现住址 -->\n" +
                        "      <addr use=\"H\">\n" +
                        "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                        "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                        "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                        "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                        "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                        "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                        "      </addr>\n" +
                        "      <!--HDSD00.16.018  DE02.01.010.00  患者电话号码-->\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "\n" +
                        "\n" +
                        "        <!--HDSD00.16.019  DE02.01.039.00  患者姓名 -->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <!--HDSD00.16.041  DE02.01.040.00  性别代码-->\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <birthTime value=\"20080101\"/>\n" +
                        "\n" +
                        "        <!--HDSD00.16.020  DE02.01.018.00  婚姻状况代码 -->\n" +
                        "        <maritalStatusCode code=\"" + cdaData.getCustomCol("DE02_01_018_00") + "\" displayName=\"已婚\" codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表（GB/T 2261.2）\"/>\n" +
                        "        <!--HDSD00.16.026  DE02.01.026.00  年龄（岁）-->\n" +
                        "        <!--HDSD00.16.027  DE02.01.032.00  年龄（月）-->\n" +
                        "        <age value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\" unit=\"岁\"></age>\n" +
                        "\n" +
                        "\n" +
                        "        <!--HDSD00.16.046  DE02.01.052.00  职业类别代码-->\n" +
                        "        <occupation>\n" +
                        "          <occupationCode code=\"" + cdaData.getCustomCol("DE02_01_052_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemVersion=\"从业状况（个人身体）代码表\" displayName=\"职员\"/>\n" +
                        "        </occupation>\n" +
                        "\n" +
                        "      </patient>\n" +
                        "      <!--提供患者服务机构-->\n" +
                        "      <providerOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--HDSD00.16.043  DE08.10.052.00  医疗机构组织机构代码-->\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗机构组织机构代码\"/>\n" +
                        "        <!--住院机构名称-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_10_052_00") + "</name>\n" +
                        "      </providerOrganization>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <!-- 文档创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time xsi:type=\"TS\" value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"" +cdaData.getCustomCol("AUTHENTICATOR_ID")+"\"/>\n"  +
                        "      <assignedPerson>\n" +
                        "         <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "         <id root=\"2.16.156.10011.1.5\" extension=\"40000323-5\"/>\n" +
                        "         <name>吉林大学第二医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!--法定审核者 表达对文档直接起到法律效应的法定审核者信息 -->\n" +
                        "  <legalAuthenticator typeCode=\"LA\">\n" +
                        "    <!-- HDSD00.16.028  DE09.00.053.00  签名日期时间 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <!--HDSD00.16.053  DE02.01.039.00  住院医师签名-->\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"" +cdaData.getCustomCol("AUTHENTICATOR_ID")+"\"/>\n" +
                        "      <code displayName=\"住院医师\"></code>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "  <!--文档审核者 该部分信息表达文档经过了一定的审核，但还没达到一定的法律效应 -->\n" +
                        "  <authenticator typeCode=\"AUTHEN\">\n" +
                        "    <!-- HDSD00.16.028  DE09.00.053.00  签名日期时间 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity classCode=\"ASSIGNED\">\n" +
                        "      <!--HDSD00.16.035  DE02.01.039.00  上级医师签名 -->\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"YS002\"/>\n" +
                        "      <code displayName=\"上级医师\" ></code>\n" +
                        "      <assignedPerson classCode=\"PSN\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <participant typeCode=\"NOT\">\n" +
                        "    <!--联系人@classCode：CON，固定值，表示角色是联系人 -->\n" +
                        "    <associatedEntity classCode=\"ECON\">\n" +
                        "      <!--HDSD00.16.023  DE02.01.010.00  联系人电话号码-->\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <!--联系人-->\n" +
                        "      <associatedPerson>\n" +
                        "        <!--HDSD00.16.024  DE02.01.039.00  联系人姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </associatedPerson>\n" +
                        "    </associatedEntity>\n" +
                        "  </participant>\n" +
                        "\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "\n" +
                        "  <!--文档中医疗卫生事件的就诊场景,即入院场景记录-->\n" +
                        "  <componentOf typeCode=\"COMP\">\n" +
                        "    <!--就诊-->\n" +
                        "    <encompassingEncounter classCode=\"ENC\" moodCode=\"EVN\" >\n" +
                        "      <!--就诊时间-->\n" +
                        "      <effectiveTime>\n" +
                        "        <!--HDSD00.16.031  DE06.00.092.00  入院日期时间-->\n" +
                        "        <low value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
                        "        <!--HDSD00.16.005  DE06.00.017.00  出院日期时间-->\n" +
                        "        <high value=\"" + cdaData.getCustomCol("DE06_00_017_00") + "\"/>\n" +
                        "      </effectiveTime>\n" +
                        "      <location>\n" +
                        "        <healthCareFacility>\n" +
                        "          <serviceProviderOrganization>\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <!-- DE01.00.026.00  病床号 -->\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "                <!-- DE01.00.019.00  病房号 -->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <!-- DE08.10.026.00  科室名称 -->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                        <!-- DE08.10.054.00  病区名称 -->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                            <!--XXX医院 -->\n" +
                        "                            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                                <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "                                <name>" + cdaData.getCustomCol("DE08_10_052_00") + "</name>\n" +
                        "                              </wholeOrganization>\n" +
                        "                            </asOrganizationPartOf>\n" +
                        "                          </wholeOrganization>\n" +
                        "                        </asOrganizationPartOf>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
                        "                  </wholeOrganization>\n" +
                        "                </asOrganizationPartOf>\n" +
                        "              </wholeOrganization>\n" +
                        "            </asOrganizationPartOf>\n" +
                        "          </serviceProviderOrganization>\n" +
                        "        </healthCareFacility>\n" +
                        "      </location>\n" +
                        "    </encompassingEncounter>\n" +
                        "  </componentOf>\n" +
                        "\n" +
                        "\n" +
                        "  <!--***************************************************\n" +
                        "  文档体Body\n" +
                        "  *******************************************************\n" +
                        "  -->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--主要健康问题章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "        <code code=\"11450-4\" displayName=\"PROBLEM LIST\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" />\n" +
                        "          <text/>\n" +
                        "          <!--HDSD00.16.030  DE05.10.148.00  入院情况  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "            <code code=\"DE05.10.148.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院情况\"/>\n" +
                        "            <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_148_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!--入院诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "        <code code=\"46241-6\" displayName=\"HOSPITAL ADMISSION DX\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" />\n" +
                        "          <text/>\n" +
                        "          <!--HDSD00.16.032  DE05.01.024.00  入院诊断-西医诊断编码  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-西医诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.033  DE05.10.130.00  入院诊断-中医病名代码  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.130.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医病名代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病名分类(GB/T 15657-1995)\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.034  DE05.10.130.00  入院诊断-中医证候代码  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.130.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医证候代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病名分类(GB/T 15657-1995)\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "\n" +
                        "      <!--出院诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "        <code code=\"11535-2\" displayName=\"Discharge Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" />\n" +
                        "          <text/>\n" +
                        "          <!--HDSD00.16.008  DE05.01.024.00  出院诊断-西医诊断编码  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-西医诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.009  DE05.10.130.00  出院诊断-中医病名代码  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.130.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-中医病名代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病名分类(GB/T 15657-1995)\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.010  DE05.10.130.00  出院诊断-中医诊断代码  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.130.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院诊断-中医证候代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病名分类(GB/T 15657-1995)\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--HDSD00.16.051  DE02.10.028.00  中医“四诊”观察结果  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "            <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"中医“四诊”观察结果\"/>\n" +
                        "            <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--HDSD00.16.006  DE04.01.117.00  出院时症状与体征  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.117.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院时症状与体征\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_01_117_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--HDSD00.16.004  DE06.00.193.00  出院情况  条目   -->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.193.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院情况\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_193_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!--手术操作章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" />\n" +
                        "          <text/>\n" +
                        "          <!--手术记录条目-->\n" +
                        "          <entry>\n" +
                        "            <!-- 手术记录 -->\n" +
                        "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                        "              <!--HDSD00.16.038  DE06.00.093.00  手术及操作编码 -->\n" +
                        "              <code code=\"" + cdaData.getCustomCol("DE06_00_093_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                        "              <statusCode/>\n" +
                        "              <!--手术及操作编码、操作日期/时间-->\n" +
                        "              <!--HDSD00.16.039  DE06.00.221.00  手术及操作开始日期时间 -->\n" +
                        "              <effectiveTime value=\"" + cdaData.getCustomCol("DE06_00_221_00") + "\"/>\n" +
                        "\n" +
                        "              <!--HDSD00.16.040  DE06.00.257.00  手术切口类别代码 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.257.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术切口类别代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_257_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.251\" codeSystemName=\"手术切口类别代码\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <!--HDSD00.16.029  DE05.10.147.00  切口愈合等级代码 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.147.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"切口愈合等级代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_147_00") + "\" displayName=\"切口等级Ⅰ/愈合类型甲\" codeSystem=\"2.16.156.10011.2.3.1.252\" codeSystemName=\"切口愈合等级代码\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <!--HDSD00.16.025  DE06.00.073.00  麻醉方法代码 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.2\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉方法代码\"/>\n" +
                        "                  <value code=\"" + cdaData.getCustomCol("DE06_00_073_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.159\" codeSystemName=\"麻醉方法代码\" xsi:type=\"CD\"></value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <!-- HDSD00.16.037  DE05.10.063.00  手术过程 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE05.10.063.00\" codeSystem=\"2.16.156.10011.2.2.2\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术过程\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_063_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </procedure>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 治疗计划章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"18776-5\" codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"TREATMENT PLAN\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--HDSD00.16.048  DE06.00.300.00  治则治法  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.300.00\"  codeSystem=\"2.16.156.10011.2.3.3.15\" codeSystemName=\"卫生信息数据元目录\" displayName=\"治则治法\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_300_00") + "</value>\n" +
                        "              <!--GB/T 16751.3-1997-->\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!--住院过程章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8648-8\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Hospital Course\"/>\n" +
                        "          <text/>\n" +
                        "          <!--HDSD00.16.045  DE06.00.296.00  诊疗过程描述  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.296.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"诊疗过程描述\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_296_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.047  DE05.10.113.00  治疗结果代码  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.113.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"治疗结果代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_113_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.148\" codeSystemName=\"治疗结果代码\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.036  DE06.00.310.00  实际住院天数  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.310.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"实际住院天数\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_310_00") + "\" unit=\"天\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 医嘱章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"46209-3\"  codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"Provider Orders\"  codeSystemName=\"LOINC\"></code>\n" +
                        "          <text/>\n" +
                        "          <!--HDSD00.16.049  DE08.50.047.00  中药煎煮方法  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN \">\n" +
                        "              <code code=\"DE08.50.047.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"中药煎煮方法\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_047_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.050  DE06.00.136.00  中药用药方法  条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.136.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"中药用药方法\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_136_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--HDSD00.16.007  DE06.00.287.00  出院医嘱  条目-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.287.00\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"出院医嘱\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_287_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "            <!--实验室检查章节-->\n" +
                        "            <component>\n" +
                        "                <section>\n" +
                        "                    <code code=\"30954-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"STUDIES SUMMARY\"/>\n" +
                        "                    <text/>\n" +
                        "                    <!--阳性辅助检查结果条目-->\n" +
                        "          <entry typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
                        "            <!--阳性辅助检查结果-->\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
                        "                <!--HDSD00.16.042  DE04.50.128.00  阳性辅助检查结果  -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.128.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"  />\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_128_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
