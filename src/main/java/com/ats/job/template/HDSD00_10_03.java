package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 特殊检查及特殊治疗同意书子集
 */
public class HDSD00_10_03 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_10_03(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ../sdschemas/CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.49\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0029\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>特殊检查及特殊治疗同意书</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <!--患者信息-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole>\n" +
                        "      <!--门诊号-->\n" +
                        "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "      <!--住院号-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 知情同意书编号 -->\n" +
                        "      <id root=\"2.16.156.10011.1.34\" extension=\"" + cdaData.getCustomCol("DE09_00_118_00") + "\"/>\n" +
                        "\n" +
                        "      <patient>\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <!--性别-->\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <!--出生日期-->\n" +
                        "        <birthTime value=\"199101010\"/>\n" +
                        "\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"></age>\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!--作者-->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <!--医师签名-->\n" +
                        "  <legalAuthenticator typeCode=\"LA\">\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE06_00_048_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "  <!-- 患者签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <!-- DE09.00.053.00  患者/法定代理人签名日期时间 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE06_00_048_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"420106201101011919\"/>\n" +
                        "      <code displayName=\"患者\"></code>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <!--代理人签名-->\n" +
                        "  <authenticator>\n" +
                        "    <!-- DE09.00.053.00  患者/法定代理人签名日期时间 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE06_00_048_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.3\" extension=\"ID420106201101011919\"/>\n" +
                        "      <!--代理人关系-->\n" +
                        "      <code code=\"" + cdaData.getCustomCol("DE02_10_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.8\" codeSystemName=\"GB/T 4716-2008\"/>\n" +
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
                        "  <!--BODY-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"29548-5\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Diagnosis\"/>\n" +
                        "          <text/>\n" +
                        "          <!--疾病诊断编码-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"疾病诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.100\" codeSystemName=\"ICD-10\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--治疗计划章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"59772-4\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Planned procedure\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!--特殊检查及特殊治疗项目名称-->\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.306.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"特殊检查及特殊治疗项目名称\"/>\n" +
                        "              <value xsi:type=\"ST\">特殊检查及特殊治疗项目名称</value>\n" +
                        "              <!--特殊检查及特殊治疗目的-->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.305.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"特殊检查及特殊治疗目的\"/>\n" +
                        "                  <value xsi:type=\"ST\">特殊检查及特殊治疗目的</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--替代方案-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.301.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"替代方案\"/>\n" +
                        "              <value xsi:type=\"ST\">替代方案</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--风险章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"操作风险\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"DEF\">\n" +
                        "              <code code=\"DE05.01.075.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"特殊检查及特殊治疗可能引起的并发症及风险\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_075_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--意见章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"意见章节\"/>\n" +
                        "          <text/>\n" +
                        "          <!--医疗机构意见-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.018.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"医疗机构的意见\"><qualifier><name displayName=\"医疗机构意见\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_018_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!--患者意见-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.018.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"患者意见\"></name></qualifier></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_018_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
