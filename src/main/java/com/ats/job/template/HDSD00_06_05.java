package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 麻醉术前访视记录
 */
public class HDSD00_06_05 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_06_05(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <!--\n" +
                        "********************************************************\n" +
                        "Header\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.30\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0010\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>麻醉术前访视记录</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <!--文档记录对象（患者） [1..*] contextControlCode=\"OP\"表示本信息可以被重载-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--门诊号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <!--电子申请单编号-->\n" +
                        "      <id root=\"2.16.156.10011.1.24\" extension=\"" + cdaData.getCustomCol("DE01_00_008_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                        "\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" displayName=\"男性\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <!-- 年龄 -->\n" +
                        "        <age value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\" unit=\"岁\"/>\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <!-- 文档创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <!-- 保管机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!--麻醉医师签名-->\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间-->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"麻醉医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "\n" +
                        "  <!-- 病床号、病房、病区、科室和医院的关联 -->\n" +
                        "  <componentOf>\n" +
                        "    <encompassingEncounter>\n" +
                        "      <!-- 入院日期时间 -->\n" +
                        "      <effectiveTime/>\n" +
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
                        "  <!--***************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "术前诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10219-4\" displayName=\"Surgical operation note preoperative Dx\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--术前诊断-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--术前诊断编码-->\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" displayName=\"创伤性脑损伤\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 术前合并疾病 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.076.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前合并疾病\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_076_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!--现病史章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10164-2\" displayName=\"HISTORY OF PRESENT ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--简要病史条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.140.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"简要病史\"/>\n" +
                        "              <value xsi:type=\"ST\">\"" + cdaData.getCustomCol("DE05_10_140_00") + "\"</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--既往史章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11348-0\" displayName=\"HISTORY OF PAST ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--过敏史条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏史\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_022_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--体格检查章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"29545-1\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"PHYSICAL EXAMINATION\"/>\n" +
                        "          <text/>\n" +
                        "          <!-- 体重 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.188.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体重\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_188_00") + "\" unit=\"kg\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 一般状况检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.219.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"一般状况检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_219_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 精神状态正常标志 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.142.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"精神状态正常标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_142_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 心脏听诊结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.207.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"心脏听诊结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_207_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 肺部听诊结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.031.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"肺部听诊结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_031_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 四肢检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.179.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"四肢检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_179_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 脊柱检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.093.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"脊柱检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_093_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 腹部检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.046.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"腹部检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_046_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 气管检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.230.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"气管检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_230_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 牙齿检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.264.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"牙齿检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_264_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "实验室检查章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"30954-2\" displayName=\"STUDIES SUMMARY\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <!-- 血型-->\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component typeCode=\"COMP\">\n" +
                        "                <!-- ABO血型 -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"ABO血型代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_001_00") + "\" displayName=\"A型\" codeSystem=\"2.16.156.10011.2.3.1.85\" codeSystemName=\"ABO血型代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component typeCode=\"COMP\">\n" +
                        "                <!-- Rh血型 -->\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.010.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"Rh（D）血型代码\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_010_00") + "\" displayName=\"阳性\" codeSystem=\"2.16.156.10011.2.3.1.250\" codeSystemName=\"Rh（D）血型代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "          <!-- 心电图检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.043.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"心电图检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_043_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 胸部X线检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.045.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"胸部X线检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_045_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- CT检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.005.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"CT检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_005_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- B超检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.002.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"B超检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_002_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- MRI检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.009.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"MRI检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_009_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 肺功能检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.009.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"肺功能检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_009_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 血常规检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.128.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"血常规检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_128_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 尿常规检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.048.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"尿常规检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_048_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 凝血功能检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.142.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"凝血功能检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_142_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 肝功能检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.026.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"肝功能检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_026_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 血气分析检查结果 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.128.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"血气分析检查结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_128_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--\n" +
                        "********************************************************\n" +
                        "治疗计划章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!-- 拟实施手术及操作编码 DE06.00.093.00 -->\n" +
                        "          <entry>\n" +
                        "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                        "              <code xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_093_00") + "\" displayName=\"脑室-腹腔分流术\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                        "              <!--手术间编号-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.256.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"患者实施手术所在的手术室编号\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_256_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </procedure>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <entry>\n" +
                        "            <!-- 拟实施麻醉方法代码 -->\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"INT\">\n" +
                        "              <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"拟实施麻醉方法代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_073_00") + "\" displayName=\"全身麻醉\" codeSystem=\"2.16.156.10011.2.3.1.159\" codeSystemName=\"麻醉方法代码表\"/>\n" +
                        "              <!-- 术前麻醉医嘱 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"INT\">\n" +
                        "                  <code code=\"DE06.00.287.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"术前麻醉医嘱\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_287_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!-- 麻醉适应证 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.227.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉适应证\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_277_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <!-- 注意事项 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE09.00.119.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"注意事项\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE09_00_119_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
