package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 检验记录子集
 */
public class HDSD00_05_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_05_01(CDAData cdaData) {
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
                        "  <templateId root=\"2.16.156.10011.2.1.1.27\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0007\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>检验记录</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "\n" +
                        "  <!--文档记录对象（患者）-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "\n" +
                        "      <!--门（急）诊号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "\n" +
                        "      <!--检验报告单号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.33\" extension=\"" + cdaData.getCustomCol("DE01_00_018_00") + "\"/>\n" +
                        "\n" +
                        "      <!--电子申请单编号-->\n" +
                        "      <id root=\"2.16.156.10011.1.24\" extension=\"" + cdaData.getCustomCol("DE01_00_008_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 检验标本编号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.14\" extension=\"" + cdaData.getCustomCol("DE01_00_003_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 患者类别代码 -->\n" +
                        "      <patientType>\n" +
                        "        <patienttypeCode code=\"1\" codeSystem=\"2.16.156.10011.2.3.1.271\" codeSystemName=\"患者类型代码表\" displayName=\"门诊\"></patienttypeCode>\n" +
                        "      </patientType>\n" +
                        "\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                        "\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "\n" +
                        "        <!-- 年龄 -->\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"></age>\n" +
                        "\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <!-- 检验报告医师（文档创作者） -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "\n" +
                        "    <!-- 检验报告日期 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE04_50_133_00") + "\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <!-- 医师姓名 -->\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <!-- 保管机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "      <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "        </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!-- 审核医师签名 -->\n" +
                        "  <legalAuthenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"审核医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "\n" +
                        "  <!-- 检验技师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"检验技师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 检验医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"检查验医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 检验申请机构及科室 -->\n" +
                        "  <participant typeCode=\"PRF\">\n" +
                        "    <associatedEntity classCode=\"ASSIGNED\">\n" +
                        "      <scopingOrganization>\n" +
                        "        <id root=\"2.16.156.10011.1.26\" extension=\"001\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "        <asOrganizationPartOf>\n" +
                        "          <wholeOrganization>\n" +
                        "            <id root=\"2.16.156.10011.1.5\" extension=\"检验申请机构编号\"/>\n" +
                        "            <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "          </wholeOrganization>\n" +
                        "        </asOrganizationPartOf>\n" +
                        "      </scopingOrganization>\n" +
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
                        "\n" +
                        "<!--***************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "\n" +
                        "            <!-- 诊断记录章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "                    <code code=\"29548-5\" displayName=\"Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "                    <text/>\n" +
                        "                    <!--条目：诊断-->\n" +
                        "                    <entry>\n" +
                        "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                            <code code=\"DE05.01.024.00\" displayName=\"诊断代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                            <!--诊断日期-->\n" +
                        "                            <effectiveTime value=\"" + cdaData.getCustomCol("DE05_01_058_00") + "\"></effectiveTime>\n" +
                        "                            <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"></value>\n" +
                        "                            <performer>\n" +
                        "                <assignedEntity>\n" +
                        "                  <id/>\n" +
                        "                  <representedOrganization>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "                  </representedOrganization>\n" +
                        "                </assignedEntity>\n" +
                        "              </performer>\n" +
                        "                        </observation>\n" +
                        "                    </entry>\n" +
                        "               </section>\n" +
                        "            </component>\n" +
                        "\n" +
                        "      <!--实验室检查章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"30954-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"STUDIES SUMMARY\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.027.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验方法名称\"></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_027_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.018.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验类别\"></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_018_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.019.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验项目代码\"></code>\n" +
                        "              <!-- 检验时间 -->\n" +
                        "              <effectiveTime value=\"" + cdaData.getCustomCol("DE04_50_140_00") + "\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_019_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.134.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"标本类别\"></code>\n" +
                        "                  <!-- DE04.50.137.00  标本采样日期时间\n" +
                        "DE04.50.141.00  接收标本日期时间 -->\n" +
                        "                  <effectiveTime>\n" +
                        "                    <low value=\"" + cdaData.getCustomCol("DE04_50_137_00") + "\"></low>\n" +
                        "                    <high value=\"" + cdaData.getCustomCol("DE04_50_141_00") + "\"></high>\n" +
                        "                  </effectiveTime>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_134_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.135.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"标本状态\"></code>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_135_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.017.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验结果代码\"></code>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_30_017_00") + "\" codeSystem=\"2.16.156.10011.2.3.2.38\" codeSystemName=\"检查（检验）结果代码表\"></value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.015.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验定量结果\"></code>\n" +
                        "              <value xsi:type=\"REAL\" value=\"" + cdaData.getCustomCol("DE04_30_015_00") + "\"></value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.30.016.00\" displayName=\"检查定量结果计量单位\" codeSystemName=\"卫生信息数据元目录\" codeSystem=\"2.16.156.10011.2.2.1\" />\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_016_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 检验报告章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"检验报告\" />\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验报告结果\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_130_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.10.026.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验报告科室\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_10_026_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.10.013.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验报告机构名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_10_013_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.179.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检验报告备注\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_179_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
