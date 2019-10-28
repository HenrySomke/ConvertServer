package com.ats.job.template;

import com.ats.job.bean.CDAData;

import java.util.List;
import java.util.Map;

/**
 *   HDSD00.02_02	患者基本信息子集
 *   HDSD00.02_03	基本健康信息子集
 *   HDSD00.02_01	卫生事件摘要子集
 *   HDSD00.02_04	医疗费用记录子集
 *
 */
public class HDSD00_02 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_02(CDAData cdaData) {
        CDA = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                "\n" +
                "  <realmCode code=\"CN\"/>\n" +
                "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                "  <templateId  root=\"2.16.156.10011.2.1.1.21\"/>\n" +
                "\n" +
                "  <!-- 文档流水号 -->\n" +
                "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                "\n" +
                "  <code code=\"C0001\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"></code>\n" +
                "  <title>病历概要</title>\n" +
                "\n" +
                "  <!-- 文档机器生成时间 -->\n" +
                "  <effectiveTime value=\"20121024154823\"/>\n" +
                "\n" +
                "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                "  <languageCode code=\"zh-CN\"/>\n" +
                "  <setId/>\n" +
                "  <versionNumber/>\n" +
                "\n" +
                "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                "    <patientRole classCode=\"PAT\">\n" +
                "\n" +
                "      <!--健康档案标识号-->\n" +
                "      <id root=\"2.16.156.10011.1.2\" extension=\"" + cdaData.getCustomCol("DE01_00_009_00") + "\"/>\n" +
                "\n" +
                "      <!--健康卡号-->\n" +
                "      <id root=\"2.16.156.10011.1.19\" extension=\"" + cdaData.getCustomCol("DE01_00_021_00") + "\"/>\n" +
                "\n" +
                "      <addr use=\"H\">\n" +
                "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                "        <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                "      </addr>\n" +
                "      <!-- 患者电话 -->\n" +
                "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "\n" +
                "        <!--患者身份证号标识-->\n" +
                "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                "        <!-- 患者姓名 -->\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "        <!-- 性别代码 -->\n" +
                "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                "        <birthTime value=\"" + cdaData.getCustomCol("DE02_01_005_01") + "\"/>\n" +
                "        <!-- 婚姻状况代码 -->\n" +
                "        <maritalStatusCode code=\"" + cdaData.getCustomCol("DE02_01_018_00") + "\" displayName=\"未婚\" codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表（GB/T 2261.2）\"/>\n" +
                "        <!-- 民族 -->\n" +
                "        <ethnicGroupCode code=\"" + cdaData.getCustomCol("DE02_01_025_00") + "\" displayName=\"汉族\" codeSystem=\"2.16.156.10011.2.3.3.3\" codeSystemName=\"民族类别代码表（GB 3304）\"/>\n" +
                "\n" +
                "        <!-- 工作单位 -->\n" +
                "        <employerOrganization>\n" +
                "          <name>" + cdaData.getCustomCol("DE02_01_004_00") + "</name>\n" +
                "          <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"></telecom>\n" +
                "        </employerOrganization>\n" +
                "\n" +
                "        <!--职业状况-->\n" +
                "        <occupation>\n" +
                "          <occupationCode code=\"" + cdaData.getCustomCol("DE02_01_052_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemName=\"从业状况（个人身体）代码表（GB/T 2261.4）\" displayName=\"职员\"/>\n" +
                "        </occupation>\n" +
                "      </patient>\n" +
                "\n" +
                "    </patientRole>\n" +
                "  </recordTarget>\n" +
                "\n" +
                "  <!--创建者-->\n" +
                "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                "    <!-- 建档日期 -->\n" +
                "    <time value=\"" + cdaData.getCustomCol("DE06_01_062_00") + "\"/>\n" +
                "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                "      <!-- 建档者姓名 -->\n" +
                "      <assignedPerson>\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "      <!-- 建档机构 -->\n" +
                "      <representedOrganization>\n" +
                "        <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                "        <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                "      </representedOrganization>\n" +
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
                "  <!--其他参与者（联系人）@typeCode: NOT(ugent notification contact)，固定值，表示不同的参与者 -->\n" +
                "  <participant typeCode=\"NOT\">\n" +
                "    <!--联系人@classCode：CON，固定值，表示角色是联系人 -->\n" +
                "    <associatedEntity classCode=\"ECON\">\n" +
                "      <!--联系人类别，表示与患者之间的关系-->\n" +
                "      <code/>\n" +
                "            <!--联系人地址-->\n" +
                "      <addr>\n" +
                "        <houseNumber>" + cdaData.getCustomCol("DE02_01_009_06") + "</houseNumber>\n" +
                "        <streetName>" + cdaData.getCustomCol("DE02_01_009_05") + "</streetName>\n" +
                "        <township>" + cdaData.getCustomCol("DE02_01_009_04") + "</township>\n" +
                "        <county>" + cdaData.getCustomCol("DE02_01_009_03") + "</county>\n" +
                "        <city>" + cdaData.getCustomCol("DE02_01_009_02") + "</city>\n" +
                "        <state>" + cdaData.getCustomCol("DE02_01_009_01") + "</state>\n" +
                "        <postalCode>" + cdaData.getCustomCol("DE02_01_047_00") + "</postalCode>\n" +
                "      </addr>\n" +
                "      <!--电话号码-->\n" +
                "      <telecom use=\"H\" value=\"tel:999-999-999999\"/>\n" +
                "      <!--联系人-->\n" +
                "      <associatedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "        <!--姓名-->\n" +
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
                "  <component>\n" +
                "    <structuredBody>\n" +
                "\n" +
                "      <!-- 实验室检验章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"30954-2\" displayName=\"STUDIES SUMMARY\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!-- 血型-->\n" +
                "          <entry typeCode=\"COMP\">\n" +
                "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                "              <statusCode/>\n" +
                "              <!-- ABO血型 -->\n" +
                "              <component typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE04.50.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"  />\n" +
                "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_001_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.85\" codeSystemName=\"ABO血型代码表\" displayName=\"A型\"/>\n" +
                "                </observation>\n" +
                "              </component>\n" +
                "              <!-- Rh血型 -->\n" +
                "              <component typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE04.50.010.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" />\n" +
                "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_50_010_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.250\" codeSystemName=\"Rh血型代码表\" displayName=\"阴性\"/>\n" +
                "                </observation>\n" +
                "              </component>\n" +
                "            </organizer>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 既往史章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"11348-0\" displayName=\"HISTORY OF PAST ILLNESS\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!-- 疾病史（含外伤） -->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.026.00\" displayName=\"疾病史（含外伤）\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_026_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "          <!-- 传染病史 -->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.008.00\" displayName=\"传染病史\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_008_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.061.00\" displayName=\"手术史\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_061_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "\n" +
                "          <!--婚育史条目-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.098.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"婚育史\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_098_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 输血章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"56836-0\" displayName=\"History of blood transfusion\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.100.00\" displayName=\"输血史\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_100_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!-- 过敏史章节 -->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"48765-2\" displayName=\"Allergies, adverse reactions, alerts\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "\n" +
                "          <!--过敏史条目-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.01.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏史\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_01_022_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "\n" +
                "      <!--预防接种史章节-->\n" +
                "            <component>\n" +
                "                <section>\n" +
                "                    <code code=\"11369-6\" codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"HISTORY OF IMMUNIZATIONS\" codeSystemName=\"LOINC\"/>\n" +
                "                    <text/>\n" +
                "                    <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.101.00\" displayName=\"预防接种史\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_101_00") + "</value>\n" +
                "            </observation>\n" +
                "                    </entry>\n" +
                "                </section>\n" +
                "            </component>\n" +
                "\n" +
                "      <!--个人史章节-->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"29762-2\" displayName=\"Social history\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!--个人史条目-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.097.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"个人史\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_097_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "      <!--月经史章节-->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "          <code code=\"49033-4\" displayName=\"Menstrual History\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "          <text/>\n" +
                "          <!--月经史条目-->\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.102.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"月经史\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_102_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "        </section>\n" +
                "      </component>\n" +
                "\n" +
                "            <!--家族史章节-->\n" +
                "            <component>\n" +
                "                <section>\n" +
                "                    <code code=\"10157-6\" displayName=\"HISTORY OF FAMILY MEMBER DISEASES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "                    <text/>\n" +
                "                    <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE02.10.103.00\" displayName=\"家族史\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_103_00") + "</value>\n" +
                "            </observation>\n" +
                "                    </entry>\n" +
                "                </section>\n" +
                "            </component>\n" +
                "\n" +
                "            <!-- 卫生事件章节 -->\n" +
                "            <component>\n" +
                "        <section>\n" +
                "          <code displayName=\"卫生事件\"></code>\n" +
                "          <text/>\n";

        //卫生事件子集for
        List<Map<String, Object>> list = cdaData.getCustomColMap("HDSD00_02_01");
        for (Map<String, Object> colMap : list) {
            CDAData cdaData0201 = new CDAData(colMap);
            CDA +=  "          <entry>\n" +
                    "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "              <code code=\"DE08.10.026.00\" displayName=\"医疗机构科室名称\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "              <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE08_10_026_00") + "</value>\n" +
                    "            </observation>\n" +
                    "          </entry>\n" +
                    "          <entry>\n" +
                    "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "              <code code=\"DE02.01.060.00\" displayName=\"患者类型代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "              <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE02_01_060_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.271\" codeSystemName=\"患者类型代码表\"></value>\n" +
                    "            </observation>\n" +
                    "          </entry>\n" +
                    "\n" +
                    "          <entry>\n" +
                    "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "              <code code=\"DE01.00.010.00\" displayName=\"门（急）诊号\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "              <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE01_00_010_00") + "</value>\n" +
                    "            </observation>\n" +
                    "          </entry>\n" +
                    "          <entry>\n" +
                    "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "              <code code=\"DE01.00.014.00\" displayName=\"住院号\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "              <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE01_00_014_00") + "</value>\n" +
                    "            </observation>\n" +
                    "          </entry>\n" +
                    "\n" +
                    "          <entry>\n" +
                    "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                    "              <statusCode/>\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE06.00.092.00\" displayName=\"入院日期时间\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "                  <value xsi:type=\"TS\" value=\"" + cdaData0201.getCustomCol("DE06_00_092_00") + "\"></value>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE06.00.017.00\" displayName=\"出院日期时间\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "                  <value xsi:type=\"TS\" value=\"" + cdaData0201.getCustomCol("DE06_00_017_00") + "\"></value>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "            </organizer>\n" +
                    "          </entry>\n" +
                    "\n" +
                    "          <entry>\n" +
                    "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "              <code code=\"DE04.01.018.00\" displayName=\"发病日期时间\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "              <value xsi:type=\"TS\" value=\"" + cdaData0201.getCustomCol("DE04_01_018_00") + "\"></value>\n" +
                    "            </observation>\n" +
                    "          </entry>\n" +
                    "          <entry>\n" +
                    "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "              <code code=\"DE05.10.053.00\" displayName=\"就诊原因\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"></code>\n" +
                    "              <!-- 就诊日期时间 DE06.00.062.00-->\n" +
                    "              <effectiveTime value=\"" + cdaData0201.getCustomCol("DE06_00_062_00") + "\"/>\n" +
                    "              <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE05_10_053_00") + "</value>\n" +
                    "            </observation>\n" +
                    "          </entry>\n" +
                    "\n" +
                    "                    <!--条目：诊断-->\n" +
                    "                    <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE05.10.024.00\" displayName=\"西医诊断编码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"西医诊断编码\"></name></qualifier></code>\n" +
                    "                            <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_10_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.1\" codeSystemName=\"诊断代码表（ICD-10）\" displayName=\"西医诊断\"/>\n" +
                    "                            <entryRelationship typeCode=\"COMP\">\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE05.10.113.00\" displayName=\"病情转归代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                  <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_10_113_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.148\" codeSystemName=\"病情转归代码表\" displayName=\"治愈\"></value>\n" +
                    "                </observation>\n" +
                    "              </entryRelationship>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n" +
                    "\n" +
                    "                    <!--条目：诊断-->\n" +
                    "                    <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE05.10.024.00\" displayName=\"其他西医诊断编码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"其他西医诊断编码\"></name></qualifier></code>\n" +
                    "                            <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_10_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.1\" codeSystemName=\"诊断代码表（ICD-10）\"></value>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n" +
                    "\n" +
                    "                    <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE05.10.130.00\" displayName=\"中医病名代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"中医病名代码\"></name></qualifier></code>\n" +
                    "                            <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\"></value>\n" +
                    "                            <entryRelationship typeCode=\"COMP\">\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE05.10.130.00\" displayName=\"中医证候代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"><qualifier><name displayName=\"中医证候代码\"></name></qualifier></code>\n" +
                    "                  <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_10_130_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病证分类与代码表（ GB/T 15657-1995）\"></value>\n" +
                    "                </observation>\n" +
                    "              </entryRelationship>\n" +
                    "\n" +
                    "                            <entryRelationship typeCode=\"COMP\">\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE05.10.113.00\" displayName=\"病情转归代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                  <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_10_113_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.148\" codeSystemName=\"病情转归代码表\" displayName=\"治愈\"></value>\n" +
                    "                </observation>\n" +
                    "              </entryRelationship>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n" +
                    "\n" +
                    "                    <entry>\n" +
                    "                        <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                    "              <!-- 手术及操作编码 DE06.00.093.00 -->\n" +
                    "                            <code code=\"" + cdaData0201.getCustomCol("DE06_00_093_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                    "            </procedure>\n" +
                    "                    </entry>\n" +
                    "\n" +
                    "                    <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE08.50.022.00\" displayName=\"关键药物名称\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                            <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE08_50_022_00") + "</value>\n" +
                    "                            <entryRelationship typeCode=\"COMP\">\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE06.00.136.00\" displayName=\"关键药物用法\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                  <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE06_00_136_00") + "</value>\n" +
                    "                </observation>\n" +
                    "              </entryRelationship>\n" +
                    "              <entryRelationship typeCode=\"COMP\">\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE06.00.129.00\" displayName=\"药物不良反应情况\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                  <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE06_00_129_00") + "</value>\n" +
                    "                </observation>\n" +
                    "              </entryRelationship>\n" +
                    "              <entryRelationship typeCode=\"COMP\">\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE06.00.164.00\" displayName=\"中药使用类别代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                  <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE06_00_164_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.157\" codeSystemName=\"中药使用类别代码表\"></value>\n" +
                    "                </observation>\n" +
                    "              </entryRelationship>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n" +
                    "\n" +
                    "          <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE06.00.251.00\" displayName=\"其他医学处置\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "              <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE06_00_251_00") + "</value>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n" +
                    "                    <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE05.01.021.00\" displayName=\"根本死因代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "                            <value xsi:type=\"CD\" code=\"" + cdaData0201.getCustomCol("DE05_01_021_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.2\" codeSystemName=\"死因代码表（ICD-10）\"></value>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n" +
                    "\n" +
                    "                    <entry>\n" +
                    "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                            <code code=\"DE02.01.039.00\" displayName=\"责任医师姓名\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                    "              <value xsi:type=\"ST\">" + cdaData0201.getCustomCol("DE02_01_039_00") + "</value>\n" +
                    "                        </observation>\n" +
                    "                    </entry>\n";
        }


        list = cdaData.getCustomColMap("HDSD00_02_04");
        for (Map<String, Object> colMap : list) {
            CDAData cdaData0204 = new CDAData(colMap);
            CDA +=  "\n" +
                    "          <!-- 费用条目 -->\n" +
                    "          <entry>\n" +
                    "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                    "              <statusCode/>\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE02.01.044.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"医疗保险类别代码\"/>\n" +
                    "                  <value xsi:type=\"CD\" code=\"" + cdaData0204.getCustomCol("DE02_01_044_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.248\" codeSystemName=\"医疗保险类别代码表\"></value>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE07.00.007.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"医疗付费方式代码\" ></code>\n" +
                    "                  <value xsi:type=\"CD\" code=\"" + cdaData0204.getCustomCol("DE07_00_007_00") + "\"  codeSystem=\"2.16.156.10011.2.3.1.269\" displayName=\"城镇职工基本医疗保险\" codeSystemName=\"医疗付费方式代码表\"/>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE07.00.004.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"门诊费用金额\"/>\n" +
                    "                  <value xsi:type=\"MO\" value=\"" + cdaData0204.getCustomCol("DE07_00_004_00") + "\" currency=\"元\"></value>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE07.00.010.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"住院费用金额\"/>\n" +
                    "                  <value xsi:type=\"MO\" value=\"" + cdaData0204.getCustomCol("DE07_00_010_00") + "\" currency=\"元\"></value>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "              <component>\n" +
                    "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                    "                  <code code=\"DE07.00.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"个人承担费用金额\"/>\n" +
                    "                  <value xsi:type=\"MO\" value=\"" + cdaData0204.getCustomCol("DE07_00_001_00") + "\" currency=\"元\"></value>\n" +
                    "                </observation>\n" +
                    "              </component>\n" +
                    "            </organizer>\n" +
                    "          </entry>\n";
        }

        CDA +=  "                </section>\n" +
                "            </component>\n" +
                "    </structuredBody>\n" +
                "  </component>\n" +
                "</ClinicalDocument>\n";
    }
}
