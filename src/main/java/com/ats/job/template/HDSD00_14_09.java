package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 交接班记录子集
 */
public class HDSD00_14_09 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_14_09(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        " CDA Header\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.61\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0041\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "\n" +
                        "  <title>交接班记录</title>\n" +
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
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--患者身份证号-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\" displayName=\"女性\" />\n" +
                        "        <!--1数据集里是年龄（年）、年龄（月）-->\n" +
                        "        <birthTime value=\"" + cdaData.getCustomCol("DE02_01_005_01") + "\"/>\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <!-- 文档创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time value=\"201104041221\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <code displayName=\"文档创作者\"></code>\n" +
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
                        "  <!-- 签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <!--交班日期时间-->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"交班者\"></code>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <authenticator>\n" +
                        "    <!--接班日期时间-->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"></id>\n" +
                        "      <code displayName=\"接班者\"></code>\n" +
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
                        "<!--***************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "<!--\n" +
                        "******************************************************\n" +
                        "主诉章节\n" +
                        "******************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10154-3\" displayName=\"CHIEF COMPLAINT\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
                        "            <!-- 主诉-->\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.119.00\" displayName=\"主诉\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_01_119_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "<!--**************************************************\n" +
                        "入院诊断章节\n" +
                        "******************************************************\n" +
                        "-->\n" +
                        "      <!--入院诊断章节-->\n" +
                        "        <component>\n" +
                        "          <section>\n" +
                        "            <code code=\"46241-6\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HOSPITAL ADMISSION DX\" />\n" +
                        "            <text/>\n" +
                        "            <!--入院情况-->\n" +
                        "            <entry>\n" +
                        "              <observation classCode=\"OBS\" moodCode=\"EVN \">\n" +
                        "                <code code=\"DE05.10.148.00\" displayName=\"入院情况\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_148_00") + "</value>\n" +
                        "              </observation>\n" +
                        "            </entry>\n" +
                        "\n" +
                        "            <!--入院诊断-西医诊断编码-->\n" +
                        "            <entry>\n" +
                        "              <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                <code code=\"DE05.01.024.00\" displayName=\"入院诊断-西医诊断编码\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\" displayName=\"十二指肠梗阻\" />\n" +
                        "              </observation>\n" +
                        "            </entry>\n" +
                        "\n" +
                        "            <!--入院诊断-中医病名代码-->\n" +
                        "            <entry>\n" +
                        "              <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                <code code=\"DE05.10.130.00\" displayName=\"入院诊断-中医病名代码\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" />\n" +
                        "                <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\" displayName=\"黄疽病\" />\n" +
                        "              </observation>\n" +
                        "            </entry>\n" +
                        "\n" +
                        "            <!--入院诊断-中医症候代码-->\n" +
                        "            <entry>\n" +
                        "              <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                <code code=\"DE05.10.130.00\" displayName=\"入院诊断-中医症候代码\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" />\n" +
                        "                <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\" displayName=\"暴吐病\" />\n" +
                        "              </observation>\n" +
                        "            </entry>\n" +
                        "          </section>\n" +
                        "        </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "诊断章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <!--诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "                    <code code=\"29548-5\" displayName=\"Diagnosis\"  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "                    <text/>\n" +
                        "                    <!--条目:目前情况-->\n" +
                        "                    <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN \">\n" +
                        "              <code code=\"DE06.00.184.00\" displayName=\"目前情况\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_184_00") + "</value>\n" +
                        "            </observation>\n" +
                        "                    </entry>\n" +
                        "\n" +
                        "                    <!--目前诊断-->\n" +
                        "                    <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\" displayName=\"目前诊断-西医诊断编码\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11\" codeSystemName=\"诊断代码表（ICD-10）\" displayName=\"十二指肠梗阻\" />\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--目前诊断-中医病名代码-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.130.00\" displayName=\"目前诊断-中医病名代码\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\" displayName=\"黄疽病\" />\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--目前诊断-中医症候代码-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.130.00\" displayName=\"目前诊断-中医症候代码\"  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_10_174_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\" displayName=\"暴吐病\" />\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--中医“四诊”观察结果-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN \">\n" +
                        "              <code code=\"DE02.10.028.00\" displayName=\"中医“四诊”观察结果\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "               </section>\n" +
                        "            </component>\n" +
                        "\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        "治疗计划章节\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "      <!--章节 1..*-->\n" +
                        "            <component>\n" +
                        "                <section>\n" +
                        "                    <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\"  codeSystemName=\"LOINC\"/>\n" +
                        "                    <text/>\n" +
                        "          <!--接班诊疗计划-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.298.00\" displayName=\"接班诊疗计划\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_298_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--治则治法-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.300.00\" displayName=\"治则治法\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_300_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <!--注意事项-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN \">\n" +
                        "              <code code=\"DE09.00.119.00\" displayName=\"注意事项\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE09_00_119_00") + "</value>\n" +
                        "            </observation>\n" +
                        "                    </entry>\n" +
                        "                </section>\n" +
                        "            </component>\n" +
                        "<!--\n" +
                        "*******************************************************\n" +
                        " 住院过程章节\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8648-8\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Hospital Course\"/>\n" +
                        "          <text/>\n" +
                        "          <!--诊疗过程描述-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.296.00\" displayName=\"诊疗过程描述\"  codeSystem=\"2.16.156.10011.2.3.3.11\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_296_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
